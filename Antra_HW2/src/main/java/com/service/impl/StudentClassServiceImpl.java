package com.service.impl;

import com.domain.*;
import com.service.StudentClassService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentClassServiceImpl implements StudentClassService {

    @Override
    public StudentClassResponse getAllPairs() {
        StudentClassPair s1 = new StudentClassPair();
        StudentClassPair s2 = new StudentClassPair();
        List<StudentClassDTO> studentClassDTOS = Arrays.asList(new StudentClassDTO(s1), new StudentClassDTO(s2));
        get();
        return new StudentClassResponse(studentClassDTOS);
    }

    private void get() {
        throw new IllegalArgumentException();
    }
}
