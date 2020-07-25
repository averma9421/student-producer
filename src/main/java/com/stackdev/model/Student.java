package com.stackdev.model;

public class Student {
    private String sId;
    private String name;
    private Integer className;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassName() {
        return className;
    }

    public void setClass(Integer className) {
        this.className = className;
    }


    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

}
