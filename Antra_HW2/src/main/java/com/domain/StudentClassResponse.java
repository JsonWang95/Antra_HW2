package com.domain;

import java.util.List;

public class StudentClassResponse {
    private List<StudentClassDTO> data;

    public StudentClassResponse(List<StudentClassDTO> data) {this.data = data;}

    public List<StudentClassDTO> getData() {return data;}

    public void setData(List<StudentClassDTO> data) {this.data = data;}
}
