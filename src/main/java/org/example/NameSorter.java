package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameSorter {

    public List<String> sorted(List<String> nameList) {

        Stream<String> nameStream = nameList.stream().map(String::toUpperCase).sorted();

        return nameStream.toList();
    }
}
