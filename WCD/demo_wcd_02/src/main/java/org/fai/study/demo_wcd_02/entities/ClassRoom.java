package org.fai.study.demo_wcd_02.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "class_room")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_class")
    private Integer id;
    @Column(name = "class_name")
    private String class_name;
    @Column(name = "number_member")
    private Integer number_member;

    public ClassRoom(String class_name, Integer id, Integer number_member) {
        this.class_name = class_name;
        this.id = id;
        this.number_member = number_member;
    }

    public ClassRoom() {
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber_member() {
        return number_member;
    }

    public void setNumber_member(Integer number_member) {
        this.number_member = number_member;
    }
}
