package com.edmar.api.controller;

import com.edmar.api.dto.PersonINCreateDto;
import com.edmar.api.dto.PersonOUTCreateDto;
import com.edmar.api.entity.PersonEntity;
import com.edmar.api.service.PersonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/banana")
    public String bananinha() {
        return personService.faidfaodfahsdfasdfailsdbfila("EDMAR");
    }

    @PostMapping()
    public ResponseEntity<PersonOUTCreateDto> create(@RequestBody PersonINCreateDto dto) {
        log.info("Passei por aqui {}", dto );
        return new ResponseEntity<>(personService.createPerson(dto), HttpStatus.CREATED);
    }


    @GetMapping("/{name}")
    public ResponseEntity<PersonEntity> getByName(@PathVariable String name) {
        return ResponseEntity.ok(personService.getByName(name));
    }




    // POST - CRIANDO ALGO Created 201
    // DELETE - NOCONTE 204
    //          ok 200
    // 404
    // 500 HTTP STATUS


}
