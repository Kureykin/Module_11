package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberSorter {

    public String sorted(String[] nums) {

        String tmp = Arrays.toString(nums);

        Stream<Character> numStream = IntStream.range(0, tmp.length())
                                                .filter(index -> tmp.charAt(index) >= 48 && tmp.charAt(index) <= 57)
                                                .mapToObj(tmp::charAt)
                                                .sorted();

        return Arrays.toString(numStream.toArray());
    }
}
