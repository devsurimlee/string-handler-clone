package com.handler.parse;

import com.handler.parse.util.Sorter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SorterTest {

    private final Sorter sorter = new Sorter();

    @DisplayName("영어구문을 AaBb 순으로 오름차순으로 정렬한다.")
    @Test
    void englishSortTest() {
        String str = "JSjksdDIOAAAjkaaasdFbbbjksdlfjewio";
        String correct = "AAAaaabbbDdddeFfIiJjjjjkkklOoSsssw";

        final String sorted = sorter.sort(str);
        assertThat(sorted).isEqualTo(correct);
    }

    @DisplayName("숫자구문을 0-9 순으로 오름차순으로 정렬한다.")
    @Test
    void numberSortTest() {
        String num = "7824906217835906890681";
        String correct = "0001122345666778888999";

        final String sorted = sorter.sort(num);
        assertThat(sorted).isEqualTo(correct);
    }
}
