package com.takarub.studentservice.adapter.out;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class School implements Serializable {

    private Integer id;

    private String name;

    private String email;

    private String address;
}
