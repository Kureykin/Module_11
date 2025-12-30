package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class Zip {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        ListIterator<T> firstList = first.toList().listIterator();
        ListIterator<T> secondList = second.toList().listIterator();
        ArrayList<T> list = new ArrayList<>();

        while (firstList.hasNext() && secondList.hasNext()) {

            list.add(firstList.next());
            list.add(secondList.next());

        }

        return list.stream();
    }
}
