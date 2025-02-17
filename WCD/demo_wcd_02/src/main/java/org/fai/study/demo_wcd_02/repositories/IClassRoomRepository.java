package org.fai.study.demo_wcd_02.repositories;

import org.fai.study.demo_wcd_02.dtos.ClassRoomDto;
import org.fai.study.demo_wcd_02.entities.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IClassRoomRepository extends JpaRepository<ClassRoom, Long> {
    @Query("select new org.fai.study.demo_wcd_02.dtos.ClassRoomDto(u.class_name, u.number_member,u.id) from ClassRoom u")
    public List<ClassRoomDto> findAllClassRoom();
}
