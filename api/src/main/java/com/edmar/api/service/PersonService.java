package com.edmar.api.service;

import com.edmar.api.dto.PersonINCreateDto;
import com.edmar.api.dto.PersonOUTCreateDto;
import com.edmar.api.entity.PersonEntity;
import com.edmar.api.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository repository;

    public String faidfaodfahsdfasdfailsdbfila(String name) {

        return "repository.findByName(name).getName() " + name;
    }

    public PersonOUTCreateDto createPerson(PersonINCreateDto dto) {
        PersonEntity personEntity = converterDtoPersonEntity(dto);

        PersonEntity saveEntity = repository.save(personEntity);

        PersonOUTCreateDto personOUTCreateDto = converterPersonEntityOUTCreateDto(saveEntity);

        return personOUTCreateDto;
    }



    public PersonEntity getByName(String name) {
        return repository.findByName(name).orElseThrow(() -> new RuntimeException("Não Deu em nada"));
    }


    private static PersonOUTCreateDto converterPersonEntityOUTCreateDto(PersonEntity saveEntity) {
        PersonOUTCreateDto personOUTCreateDto = PersonOUTCreateDto
                .builder()
                .id(saveEntity.getId())
                .name(saveEntity.getName())
                .build();
        return personOUTCreateDto;
    }


    // SERIA DENTRO DO CONVERTER
    private static PersonEntity converterDtoPersonEntity(PersonINCreateDto dto) {
        PersonEntity personEntity = PersonEntity
                .builder()
                .name(dto.getName())
                .cpf(dto.getCpf())
                .password(dto.getPassword())
                .build();
        return personEntity;
    }
}
