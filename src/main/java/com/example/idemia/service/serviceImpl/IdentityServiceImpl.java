package com.example.idemia.service.serviceImpl;

import com.example.idemia.dto.IdDocumentResponse;
import com.example.idemia.dto.IdentityDto;
import com.example.idemia.proxy.IdentityProxy;
import com.example.idemia.service.IdentityService;
import com.example.idemia.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class IdentityServiceImpl implements IdentityService {

    private final IdentityProxy identityProxy;

    @Override
    public IdentityDto createIdentity() {
        return identityProxy.createIdentity(Constants.API_KEY,
                Constants.CONTENT_TYPE_MULTIPART_FORM_DATA);
    }

    @Override
    public IdDocumentResponse verifyIdDocument(String identityId,
                                               MultipartFile documentFront,
                                               MultipartFile documentBack) {

        return identityProxy.verifyIdDocument(identityId,
                Constants.API_KEY,
                Constants.CONTENT_TYPE_MULTIPART_FORM_DATA,
                documentFront,
                documentBack
        );
    }
}
