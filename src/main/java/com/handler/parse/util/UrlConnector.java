package com.handler.parse.util;

import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UrlConnector {

    public String getHtml(final String url) {
        try {
            return Jsoup.connect(url).get().html();
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("해당 url에 접근할 수 없습니다. 다시 확인 해주세요");
        }
    }
}
