package com.handler.parse.dto;

import lombok.Getter;

@Getter
public class OutputUnit {

    private final String quotient;      //몫
    private final String remainder;     //나머지


   public OutputUnit(final String str, final int unitCount) {
        final int length = str.length();
        final int remainCont = length % unitCount;
        final int devideStandard = length - remainCont;

        quotient = str.substring(0, devideStandard);
        remainder = str.substring(devideStandard, length);

    }

}
