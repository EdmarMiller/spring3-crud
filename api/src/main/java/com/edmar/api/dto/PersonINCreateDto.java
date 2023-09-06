package com.edmar.api.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonINCreateDto {

    private String name;
    private String cpf;
    private String password;
}
