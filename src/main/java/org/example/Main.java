package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.example.Zip.zip;

public class Main {
    static void main() {

        List<String> nameList = Arrays.asList("Alex", "Johne", "Max", "Steve");

        System.out.println(new NameFilter().filter(nameList));

        System.out.println(new NameSorter().sorted(nameList).toString());

        System.out.println(new NumberSorter().sorted(new String[] {"1,2,0", "4,5"}));

        Stream<Long> rand = new RandNums().rannd(25214903917L, 11L, 1L << 48);

        System.out.println(Arrays.toString(zip(Stream.of(1,2,3,4), Stream.of(1,2,3,4)).toArray()));



    }
}
