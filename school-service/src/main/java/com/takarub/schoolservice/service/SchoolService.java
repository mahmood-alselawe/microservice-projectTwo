package com.takarub.schoolservice.service;


import com.takarub.schoolservice.adapter.Repository.SchoolRepository;
import com.takarub.schoolservice.adapter.Repository.entity.School;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository repository;


    public void save(School school){
        repository.save(school);
    }

    public School findById(Integer id){
        return repository.findById(id).orElseThrow();
    }

    public List<School> findAll(){
        return repository.findAll();
    }






}
