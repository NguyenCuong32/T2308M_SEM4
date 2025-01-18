package org.fai.study.demo_springboot.services;

import org.fai.study.demo_springboot.dtos.ClassRoomDto;
import org.fai.study.demo_springboot.entities.ClassRoom;

import java.util.List;

public interface IClassRoomService {
    List<ClassRoom> getClassRoomList();
    void saveClassRoom(ClassRoom classRoom);
    List<ClassRoomDto> getClassRoomDtoList();
}
