package com.handler.parse.dto;

import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public enum ExposureType {
    REMOVE_HTML(str -> str.replaceAll(Contents.REMOVE_TAG_PATTERN, Contents.EMPTY)),
    ALL_TEXT(str -> str);

    private final Function<String, String> function;

    public String getExposedHtml(final String str) {
        return function.apply(str);
    }

    private static class Contents {
        private static final String REMOVE_TAG_PATTERN = "<[^>]*>";
        private static final String EMPTY = "";
    }
}
