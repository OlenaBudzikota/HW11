package org.example.EX3;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;


public class SortArray {
    public static String sortNumbers(String[] numbers){
        return Arrays.stream(numbers)
                .flatMap(number -> Arrays.stream(number.split(", ")))
                .map(Integer::valueOf)
                .sorted()
                .map(Objects::toString)
                .collect(Collectors.joining(", "));
    }
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "7, 16", "4, 5"};
        System.out.println(sortNumbers(numbers));
    }
}
