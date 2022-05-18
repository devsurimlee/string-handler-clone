package com.handler.parse;

import com.handler.parse.dto.ExposureType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExposureTypeTest {

    final static String html = "<div>abc</abc>";

    @DisplayName("REMOVE_HTML 타입인 경우 태그를 삭제한다")
    @Test
    void removeHtml() {
        final String result = ExposureType.REMOVE_HTML.getExposedHtml(html);
        Assertions.assertThat(result).isEqualTo("abc");
    }

    @DisplayName("ALL_TEXT 타입인 경우 모든 텍스트를 가져온다.")
    @Test
    void allText() {
        final String result = ExposureType.ALL_TEXT.getExposedHtml(html);
        Assertions.assertThat(result).isEqualTo(html);
    }
}
