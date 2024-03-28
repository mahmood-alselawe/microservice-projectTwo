package com.takarub.studentservice.service;


import com.takarub.studentservice.adapter.reposoitry.StudentRepository;
import com.takarub.studentservice.adapter.reposoitry.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;
    public void insert(Student student){
        repository.save(student);
    }
    public Student findById(Integer id){
        return repository.findById(id).orElseThrow();
    }
    public List<Student> findAll(){
        return repository.findAll();
    }

    public Student findByEmail(String email){
        return repository.findByEmail(email);
    }

    public void deleteById(Integer id){
        repository.deleteById(id);
    }

    public Student findBySchoolId(Integer schoolId){
        return repository.findBySchoolId(schoolId);
    }
}
