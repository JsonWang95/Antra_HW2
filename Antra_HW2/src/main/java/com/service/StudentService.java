package com.service;

import com.domain.StudentResponse;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    StudentResponse getAllStudents();
}