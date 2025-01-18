package org.fai.study.demo_springboot.dtos;

import jakarta.persistence.Column;

public class ClassRoomDto {
    private String class_name;
    private Integer number_member;

    public ClassRoomDto(String class_name, Integer number_member) {
        this.class_name = class_name;
        this.number_member = number_member;
    }

    public ClassRoomDto() {
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public Integer getNumber_member() {
        return number_member;
    }

    public void setNumber_member(Integer number_member) {
        this.number_member = number_member;
    }
}
