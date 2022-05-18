package com.handler.parse.util;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Sorter {
    private static final String EMPTY = "";

    public String sort(final String str) {

        return Arrays.stream(str.split(EMPTY))
                .sorted()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.joining());
    }
}
