package com.example.idemia.proxy;

import com.example.idemia.dto.IdentityDto;
import com.example.idemia.utils.Constants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "identity", url = Constants.URL_MAIN_PART)
public interface IdentityProxy {

    @PostMapping("/identities")
    IdentityDto createIdentity(@RequestHeader("apikey") String apiKey,
                               @RequestHeader(value = HttpHeaders.CONTENT_TYPE) String contentHeader
    );

}
