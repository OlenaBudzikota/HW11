package org.example.EX1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddNamesSorter {
    public static String OddNames (List<String> names){
       Stream<String> sortedNames = names.stream()
               .filter(name -> names.indexOf(name)%2 == 0)
               .map(name -> (names.indexOf(name) +1 ) + ". " + name );
       return sortedNames.collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        System.out.println(OddNames(List.of("Stacy", "Caramel", "Richard", "Naomi", "Late")));
    }

}
