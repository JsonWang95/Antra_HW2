package com.service.impl;

import com.domain.*;
import com.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public StudentResponse getAllStudents() {
        Student s1 = new Student();
        Student s2 = new Student();
        List<StudentDTO> studentDTOS = Arrays.asList(new StudentDTO(s1), new StudentDTO(s2));
        get();
        return new StudentResponse(studentDTOS);
    }

    private void get() {
        throw new IllegalArgumentException();
    }
}