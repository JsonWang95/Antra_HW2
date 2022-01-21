package com.controller;

import com.domain.StudentResponse;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudentService ss;

    @Autowired
    public StudentController(@Qualifier("studentServiceImpl") StudentService ss) {
        this.ss = ss;
    }

    @GetMapping("/class")
    public ResponseEntity<StudentResponse> getStudents(){
        return new ResponseEntity<>(ss.getAllStudents(), HttpStatus.OK);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> xxExceptionHandler() {
        return null;
    }
}