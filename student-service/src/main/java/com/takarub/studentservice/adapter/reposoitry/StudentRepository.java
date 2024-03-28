package com.takarub.studentservice.adapter.reposoitry;

import com.takarub.studentservice.adapter.reposoitry.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByEmail(String email);

    Student findBySchoolId(Integer schoolId);
}
