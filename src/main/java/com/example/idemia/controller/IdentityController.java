package com.example.idemia.controller;

import com.example.idemia.dto.IdentityDto;
import com.example.idemia.service.IdentityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/identities")
@RequiredArgsConstructor
public class IdentityController {

    private final IdentityService identityService;

    @PostMapping
    public IdentityDto createIdentity() {
        return identityService.createIdentity();
    }


}
