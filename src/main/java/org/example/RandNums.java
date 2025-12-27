package org.example;

import java.util.stream.Stream;

public class RandNums {

    public Stream<Long> rannd(long a, long c, long m) {

        return Stream.iterate(0L, x -> (a * x + c) % m);
    }
}
