package com.service;

import com.domain.StudentClassResponse;
import org.springframework.stereotype.Service;

@Service
public interface StudentClassService {
    StudentClassResponse getAllPairs();
}
