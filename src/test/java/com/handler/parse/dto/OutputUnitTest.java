package com.handler.parse.dto;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

public class OutputUnitTest {

    public static final String SAMPLE_TEXT = "A0B0a0b0ccc";

    @DisplayName("문자열과 자연수 unitcount가 주어질때 몫 문자열과 나머지 문자열을 얻을 수 있다.")
    @Test
    void normal() {
        final OutputUnit outputSet = new OutputUnit(SAMPLE_TEXT, 3);
        final String quotient = "A0B0a0b0c";
        final String remainder = "cc";
        assertAll(
                () -> assertThat(outputSet.getQuotient()).isEqualTo(quotient),
                () -> assertThat(outputSet.getRemainder()).isEqualTo(remainder)
        );
    }

    @DisplayName("unitcount으로 문자열을 나눴을때 몫이 딱 맞게 떨어지면 나머지는 empty이다.")
    @Test
    void remainderEmpty() {
        final OutputUnit outputSet = new OutputUnit(SAMPLE_TEXT, SAMPLE_TEXT.length());

        assertAll(
                () -> assertThat(outputSet.getQuotient()).isEqualTo(SAMPLE_TEXT),
                () -> assertThat(outputSet.getRemainder()).isEmpty()
        );

    }

    @DisplayName("주어진 문자열이 없으면 몫과 나머지가 모두 empty이다")
    @Test
    void allEmpty() {
        final OutputUnit outputSet = new OutputUnit("", 5);

        assertAll(
                () -> assertThat(outputSet.getQuotient()).isEmpty(),
                () -> assertThat(outputSet.getRemainder()).isEmpty()
        );
    }

    @DisplayName("unitCount가 0일 경우 ArithmeticException 에러 발생.")
    @Test
    void devideZero() {
        assertThatThrownBy(
                () -> {
                    new OutputUnit(SAMPLE_TEXT, 0);
                }).isInstanceOf(ArithmeticException.class);
    }

}
