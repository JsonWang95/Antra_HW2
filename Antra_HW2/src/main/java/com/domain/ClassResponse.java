package com.domain;

import java.util.List;

public class ClassResponse {
    private List<ClassDTO> data;

    public  ClassResponse(List<ClassDTO> data) {this.data = data;}

    public List<ClassDTO> getData() {return data;}

    public void setData(List<ClassDTO> data) {this.data = data;}
}
