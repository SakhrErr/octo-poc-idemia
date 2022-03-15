package com.example.idemia.service;

import com.example.idemia.dto.ConsentDto;
import com.example.idemia.dto.ConsentRequestDto;

import java.util.List;

public interface ConsentService {

    List<ConsentDto> sendConsent(String identityId, List<ConsentRequestDto> consentRequestDtoList);

}
