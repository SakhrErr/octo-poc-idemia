package com.example.idemia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IdentityDto {

    private String id;
    private String status;
    private String levelOfAssurance;
    private Date creationDateTime;
    private Date evaluationDateTime;

}
