package com.handler.stringhandlerclone.controllor;

import com.handler.stringhandlerclone.dto.ParseRequest;
import com.handler.stringhandlerclone.dto.ParseResponse;
import com.handler.stringhandlerclone.service.ParseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ParseController {

    private final ParseService parseService;

    @PostMapping("api/parse")
    public ResponseEntity<ParseResponse> parse(@RequestBody @Valid ParseRequest request) {
            final ParseResponse response = parseService.parse(request);
            return ResponseEntity.ok(response);
    }
}
