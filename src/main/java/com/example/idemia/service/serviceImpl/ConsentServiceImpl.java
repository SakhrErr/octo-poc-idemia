package com.example.idemia.service.serviceImpl;

import com.example.idemia.dto.ConsentDto;
import com.example.idemia.dto.ConsentRequestDto;
import com.example.idemia.proxy.ConsentProxy;
import com.example.idemia.service.ConsentService;
import com.example.idemia.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsentServiceImpl implements ConsentService {

    private final ConsentProxy consentProxy;

    @Override
    public List<ConsentDto> sendConsent(String identityId, List<ConsentRequestDto> consentRequestDtoList) {

        return consentProxy.sendConsent(Constants.API_KEY, consentRequestDtoList, identityId);
    }
}
