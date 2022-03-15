package com.example.idemia.proxy;

import com.example.idemia.dto.IdDocumentResponse;
import com.example.idemia.dto.IdentityDto;
import com.example.idemia.utils.Constants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "identity", url = Constants.URL_MAIN_PART)
public interface IdentityProxy {

    @PostMapping("/identities")
    IdentityDto createIdentity(@RequestHeader("apikey") String apiKey,
                               @RequestHeader(value = HttpHeaders.CONTENT_TYPE) String contentHeader
    );

    @PostMapping("/identities/{identityId}/id-documents/capture")
    IdDocumentResponse verifyIdDocument(@RequestHeader("apikey") String apikey,
                                        @PathVariable String identityId,
                                        @RequestHeader(HttpHeaders.CONTENT_TYPE) String contentHeader,
                                        @RequestParam("DocumentFront") MultipartFile documentFront,
                                        @RequestParam("DocumentBack") MultipartFile documentBack
    );

}
