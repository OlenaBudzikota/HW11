package org.example.EX4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {
    public static Stream<Long> numbers(long seed, long a, long c, long m){
         return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long seed = 0;
        long a =25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);


         numbers(seed, a, c, m)
                .limit(10)
                .toList()
                .forEach(System.out::println);
    }
}