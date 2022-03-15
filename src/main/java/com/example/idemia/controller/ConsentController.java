package com.example.idemia.controller;

import com.example.idemia.dto.ConsentDto;
import com.example.idemia.dto.ConsentRequestDto;
import com.example.idemia.service.ConsentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/consents")
@RequiredArgsConstructor
public class ConsentController {

    private final ConsentService consentService;

    @PostMapping("/{identityId}")
    public List<ConsentDto> sendConsent(@PathVariable String identityId, @RequestBody List<ConsentRequestDto> consentRequestDtoList) {
        return consentService.sendConsent(identityId, consentRequestDtoList);
    }
}
