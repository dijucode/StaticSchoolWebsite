package com.schoolwebsite.controller;

import com.schoolwebsite.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student("Alice Johnson", 15),
                new Student("Bob Smith", 16),
                new Student("Charlie Brown", 14),
                new Student("Daisy Miller", 15),
                new Student("Ethan Hunt", 16)
        );
    }


}
