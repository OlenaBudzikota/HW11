package org.example.EX5;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

class StreamsMixer{
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Iterator<T> mixedIterator = new Iterator<>() {
            boolean firstIteratorNext = true;
            @Override
            public boolean hasNext() {
                return firstIterator.hasNext() || secondIterator.hasNext();
            }

            @Override
            public T next() {
                if (firstIteratorNext){
                    firstIteratorNext = false;
                    return firstIterator.hasNext()? firstIterator.next(): null;
                } else {
                    firstIteratorNext = true;
                    return secondIterator.hasNext()? secondIterator.next() : null;
                }
            }
        };

        return Stream.generate(mixedIterator::next).takeWhile(Objects::nonNull);
    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2 ,3, 4);
        Stream<Integer> second = Stream.of(5, 6, 7, 8, 9, 10);
        zip(first, second).toList().forEach(System.out::println);
    }

}