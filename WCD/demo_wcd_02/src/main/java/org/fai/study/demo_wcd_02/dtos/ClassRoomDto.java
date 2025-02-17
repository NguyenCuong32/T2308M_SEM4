package org.fai.study.demo_wcd_02.dtos;

public class ClassRoomDto {
    private String class_name;
    private Integer number_member;
    private Integer id;

    public ClassRoomDto(String class_name, Integer number_member, Integer id ) {
        this.class_name = class_name;
        this.number_member = number_member;
        this.id = id;
    }

    public ClassRoomDto() {
    }

    public String getClass_name() {
        return class_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
