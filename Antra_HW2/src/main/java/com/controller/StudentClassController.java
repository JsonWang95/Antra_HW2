package com.controller;

import com.domain.StudentClassResponse;
import com.service.StudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "restapi")
public class StudentClassController {
    private final StudentClassService scs;

    @Autowired
    public StudentClassController(@Qualifier("studentClassServiceImpl") StudentClassService scs) {
        this.scs = scs;
    }

    @GetMapping("/studentClassPair")
    public ResponseEntity<StudentClassResponse> getClasses(){
        return new ResponseEntity<>(scs.getAllPairs(), HttpStatus.OK);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> xxExceptionHandler() {
        return null;
    }
}

