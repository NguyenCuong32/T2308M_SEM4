package org.fai.study.demo_springboot.repository;

import org.fai.study.demo_springboot.dtos.ClassRoomDto;
import org.fai.study.demo_springboot.entities.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClassRoomRepository extends JpaRepository<ClassRoom, Long> {
    @Query("select new org.fai.study.demo_springboot.dtos.ClassRoomDto(u.class_name, u.number_member) from ClassRoom u")
    public List<ClassRoomDto> findAllClassRoom();
}
