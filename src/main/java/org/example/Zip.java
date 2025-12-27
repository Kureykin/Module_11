package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Zip {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        Stream<T> tmp = Stream.concat(first, second);

        List<T> list = new ArrayList<>(tmp.toList());
        Collections.shuffle(list);

        return list.stream();
    }
}
