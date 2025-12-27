package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameFilter {

    public String filter(List<String> nameList) {

        Stream<String> nameStream = nameList.stream()
                                            .filter(name ->nameList.indexOf(name) % 2 != 0)
                                            .map(name -> nameList.indexOf(name) + ". " + name + ", ");

        String result = nameStream.collect(Collectors.joining());

        return result.substring(0, result.length() - 2);
    }

}
