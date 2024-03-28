package com.takarub.schoolservice.adapter.Repository;

import com.takarub.schoolservice.adapter.Repository.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {

}
