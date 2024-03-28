package com.takarub.studentservice.adapter.out;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullStudents {
    private Integer id;

    private String email;

    private String name;

//    private String schoolId;

    private School school;


}
