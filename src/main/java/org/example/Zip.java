package org.example;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zip {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {


        ListIterator<T> firstList = first.toList().listIterator();
        ListIterator<T> secondList = second.toList().listIterator();


        return IntStream.iterate(0, i -> i + 1).mapToObj(i -> {
               if(firstList.hasNext() && secondList.hasNext()) {
                  return i % 2 == 0 ? firstList.next(): secondList.next();
               }
               return null;
             }).takeWhile(Objects::nonNull);
    }
}
