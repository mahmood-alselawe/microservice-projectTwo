package com.takarub.schoolservice.adapter.Repository.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class School {


    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String email;

    private String Address;


}
