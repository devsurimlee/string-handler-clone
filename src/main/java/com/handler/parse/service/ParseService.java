package com.handler.parse.service;

import com.handler.parse.dto.ParseRequest;
import com.handler.parse.dto.ParseResponse;
import com.handler.parse.util.Separator;
import com.handler.parse.util.UrlConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParseService {

    private final UrlConnector urlConnector;
    private final Separator separator;

    public ParseResponse parse(final ParseRequest request) {
        final String html = urlConnector.getHtml(request.getUrl());
        final String exposedHtml = request.getExposureType().getExposedHtml(html);
        final Separator sep = separator.separate(exposedHtml);

        return null;
    }
}
