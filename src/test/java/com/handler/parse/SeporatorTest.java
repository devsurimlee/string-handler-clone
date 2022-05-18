package com.handler.parse;

import com.handler.parse.util.Separator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class SeporatorTest {

    private final Separator separator = new Separator();

    @DisplayName("String을 입력 받으면 영어구문과 숫자구문을 얻을 수 있다.")
    @Test
    void normalCase() {
        String str = "e4C3dBA1aDf2cEAb0bF";
        String eng = "eCdBAaDfcEAbbF";
        String num = "43120";

        final Separator sep = separator.separator(str);

        assertAll(
                () -> assertThat(sep.getEnglish()).isEqualTo(eng),
                () -> assertThat(sep.getNumber()).isEqualTo(num)
        );
    }
}
