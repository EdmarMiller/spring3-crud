package com.edmar.api.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonOUTCreateDto {

    private Long id;
    private String name;

}
