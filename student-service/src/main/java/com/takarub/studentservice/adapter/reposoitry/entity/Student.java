package com.takarub.studentservice.adapter.reposoitry.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String email;

    private String gpa;

    private Integer schoolId;

}
