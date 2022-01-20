package com.domain;

import javax.persistence.*;

@Entity
@Table
public class StudentClassRelationship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    private Long studentId;
    private Long classId;

    public StudentClassRelationship(Long studentId, Long classId) {
        this.studentId = studentId;
        this.classId = classId;
    }

    public StudentClassRelationship() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }
}
