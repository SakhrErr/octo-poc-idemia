package com.example.idemia.service;

import com.example.idemia.dto.IdDocumentResponse;
import com.example.idemia.dto.IdentityDto;
import org.springframework.web.multipart.MultipartFile;

public interface IdentityService {
    IdentityDto createIdentity();
    IdDocumentResponse verifyIdDocument(String identityId,
                                        MultipartFile documentFront,
                                        MultipartFile documentBack
    );
}
