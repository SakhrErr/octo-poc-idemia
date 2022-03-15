package com.example.idemia.proxy;

import com.example.idemia.dto.ConsentDto;
import com.example.idemia.dto.ConsentRequestDto;
import com.example.idemia.utils.Constants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "consent", url = Constants.URL_MAIN_PART)
public interface ConsentProxy {

    @PostMapping("/identities/{identityId}/consents")
    List<ConsentDto> sendConsent(@RequestHeader("apikey") String apiKey,
                           @RequestBody List<ConsentRequestDto> consentRequestDtoList,
                           @PathVariable String identityId
    );

}
