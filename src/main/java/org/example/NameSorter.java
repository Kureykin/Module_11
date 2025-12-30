package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameSorter {

    public List<String> sorted(List<String> nameList) {

        return nameList.stream()
                        .map(String::toUpperCase)
                        .sorted(Comparator.reverseOrder())
                        .toList();
    }
}
