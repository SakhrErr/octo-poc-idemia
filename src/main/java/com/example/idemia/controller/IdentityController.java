package com.example.idemia.controller;

import com.example.idemia.dto.IdDocumentResponse;
import com.example.idemia.dto.IdentityDto;
import com.example.idemia.service.IdentityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/v1/identities")
@RequiredArgsConstructor
public class IdentityController {

    private final IdentityService identityService;

    @PostMapping
    public IdentityDto createIdentity() {
        return identityService.createIdentity();
    }

    @PostMapping("{identityId}/verify")
    public IdDocumentResponse verifyIdDocument(@PathVariable String identityId,
                                               @RequestParam("documentFront") MultipartFile documentFront,
                                               @RequestParam("documentBack") MultipartFile documentBack) {

        return identityService.verifyIdDocument(identityId, documentFront, documentBack);
    }


}
