package com.takarub.schoolservice.adapter.rest;


import com.takarub.schoolservice.adapter.Repository.entity.School;
import com.takarub.schoolservice.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(School school){
        service.save(school);
    }


    @GetMapping("/findAll")
    public List<School> findAll(){
        return service.findAll();
    }

    @GetMapping("/findById/{id}")
    public School findById(@PathVariable Integer id){
        return service.findById(id);
    }

}
