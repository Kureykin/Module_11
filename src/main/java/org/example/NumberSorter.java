package org.example;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberSorter {

    public String sorted(String[] nums) {

        return Arrays.toString(Arrays.stream(nums).flatMap(s -> Arrays.stream(s.split(","))).map(Integer::parseInt).sorted().toArray());
    }
}
