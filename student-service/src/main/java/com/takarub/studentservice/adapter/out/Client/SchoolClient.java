package com.takarub.studentservice.adapter.out.Client;

import com.takarub.studentservice.adapter.out.School;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("SCHOOL-SERVICE")
public interface SchoolClient {
    @GetMapping("/school/findById/{id}")
    public School findById(@PathVariable Integer id);

}
