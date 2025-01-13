package org.fai.study.test.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "class_room")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "class_name")
    private String class_name;
    @Column(name = "number_member")
    private String number_member;

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber_member() {
        return number_member;
    }

    public void setNumber_member(String number_member) {
        this.number_member = number_member;
    }
}
