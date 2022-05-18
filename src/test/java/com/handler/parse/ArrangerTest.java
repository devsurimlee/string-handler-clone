package com.handler.parse;

import com.handler.parse.util.Arranger;
import com.handler.parse.util.Separator;
import com.handler.parse.util.Sorter;
import org.assertj.core.api.Assertions;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ArrangerTest {

    private final Arranger arranger = new Arranger(new Separator(), new Sorter());

    @DisplayName("String을 입력 받으면 정렬된 영어+숫자를 얻을 수 있다.")
    @Test
    void normalCase() {
        String str = "e4C3dBA1aDf2cEAb0bF";
        String sortedEng = "AAaBbbCcDdEeFf";
        String sortedNum = "01234";

        final Arranger arrange = arranger.rearrange(str);

        assertAll(
                () -> assertThat(arrange.getSortedEnglish()).isEqualTo(sortedEng),
                () -> assertThat(arrange.getSortedNumber()).isEqualTo(sortedNum)
        );

    }
}
