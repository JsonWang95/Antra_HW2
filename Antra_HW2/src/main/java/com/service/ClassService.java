package com.service;

import com.domain.ClassResponse;
import org.springframework.stereotype.Service;

@Service
public interface ClassService {
    ClassResponse getAllClasses();
}
