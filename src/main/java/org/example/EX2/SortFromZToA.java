package org.example.EX2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortFromZToA {
    public static List<String> sortedNames(List<String> names){
        return names.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> names = List.of("Anabel", "Caramel", "Brody", "Dino", "Elane");
        System.out.println(sortedNames(names));
    }
}
