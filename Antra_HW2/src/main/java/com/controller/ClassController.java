package com.controller;

import com.domain.ClassResponse;
import com.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {
    private final ClassService cs;

    @Autowired
    public ClassController(@Qualifier("classServiceImpl") ClassService cs) {
        this.cs = cs;
    }

    @GetMapping("/class")
    public ResponseEntity<ClassResponse> getClasses(){
        return new ResponseEntity<>(cs.getAllClasses(), HttpStatus.OK);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> xxExceptionHandler() {
        return null;
    }
}
