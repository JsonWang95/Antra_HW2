package com.domain;

public class StudentClassDTO {
    private Long id;
    private String student_class_pair;

    // Need to update to student + class id
    public StudentClassDTO(Long id, String student_class_pair) {
        this.id = id;
        this.student_class_pair = student_class_pair;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudent_class_pair() {
        return student_class_pair;
    }

    public void setStudent_class_pair(String student_class_pair) {
        this.student_class_pair = student_class_pair;
    }
}
