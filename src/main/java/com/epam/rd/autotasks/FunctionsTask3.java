package com.epam.rd.autotasks;

import java.util.stream.IntStream;

public class FunctionsTask3 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        return IntStream.iterate(a1, (x) -> x + t).limit(n).reduce((x1, x2) -> x1 * x2).orElse(0);
    }
}
