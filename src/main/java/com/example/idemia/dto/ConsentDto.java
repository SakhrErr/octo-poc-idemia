package com.example.idemia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConsentDto {
    private String consentId;
    private boolean approved;
    private String type;
    private ValidityPeriod validityPeriod;


    @Getter @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    class ValidityPeriod {
        private Date to;
    }

}
