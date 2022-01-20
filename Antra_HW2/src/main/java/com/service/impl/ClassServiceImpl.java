package com.service.impl;

import com.domain.Class;
import com.domain.ClassDTO;
import com.domain.ClassResponse;
import com.service.ClassService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Override
    public ClassResponse getAllClasses() {
        Class c1 = new Class();
        Class c2 = new Class();
        List<ClassDTO> classDTOS = Arrays.asList(new ClassDTO(c1), new ClassDTO(c2));
        get();
        return new ClassResponse(classDTOS);
    }

    private void get() {
        throw new IllegalArgumentException();
    }
}

