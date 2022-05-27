package com.handler.parse.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ParseResponse {

    private final String quotient;      //몫
    private final String remainder;     //나머지

    public ParseResponse(final OutputUnit outputUnit) {
        this.quotient = outputUnit.getQuotient();
        this.remainder = outputUnit.getRemainder();
    }

}
