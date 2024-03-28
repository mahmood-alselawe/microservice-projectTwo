package com.takarub.studentservice.adapter.rest;


import com.takarub.studentservice.adapter.out.Client.SchoolClient;
import com.takarub.studentservice.adapter.out.FullStudents;
import com.takarub.studentservice.adapter.out.School;
import com.takarub.studentservice.adapter.reposoitry.entity.Student;
import com.takarub.studentservice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentsController {

    private final StudentService service;

    private final SchoolClient client;


    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody Student student){
        service.insert(student);
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return service.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @GetMapping("/findByEmail/{email}")
    public Student findByEmail(@PathVariable String email){
        return service.findByEmail(email);

    }

    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id){
        service.deleteById(id);
    }

    @GetMapping("/findStudentAndSchool/{schoolId}")
    public FullStudents findByIdAndSchool(@PathVariable Integer schoolId ){

        var student = service.findBySchoolId(schoolId);

        var school = client.findById(schoolId);


        return FullStudents.builder()
                .name(student.getName())
                .email(student.getEmail())
                .id(student.getId())
                .school(school)
                .build();


    }
}
