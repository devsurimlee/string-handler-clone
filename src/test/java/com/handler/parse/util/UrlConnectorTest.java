package com.handler.parse.util;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


public class UrlConnectorTest {

    private final UrlConnector urlConnector = new UrlConnector();

    @DisplayName("잘못된 url입력시 IllegalArgumentException이 발생한다.")
    @Test
    void urlFailTest() {
        String failUrl = "test.love";
        assertThatThrownBy(() -> urlConnector.getHtml(failUrl))
                .isInstanceOf(IllegalAccessException.class);
    }

    @DisplayName("url 입력시 html을 가져온다.")
    @ParameterizedTest
    @CsvSource({"https://www.naver.com, <title>NAVER</title>", "https://www.google.com, <title>Google</title>"})
    void urlSuccessTest(final String url, final String title) {
        final String result = urlConnector.getHtml(url);
        assertThat(result.contains(title)).isTrue();
    }
}
