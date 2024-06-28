package com.sajid.practice.spring_boot_security.controller;


import com.sajid.practice.spring_boot_security.model.Student;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>();
    @GetMapping("/students")
    public List<Student> students(){

        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Sajid");
        student1.setLastName("Ali");

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Panda");
        student2.setLastName("Ali");

        students.add(student1);
        students.add(student2);

        return students;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }


}
