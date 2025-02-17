package org.fai.study.demo_wcd_02.services;

import org.fai.study.demo_wcd_02.dtos.ClassRoomDto;
import org.fai.study.demo_wcd_02.entities.ClassRoom;

import java.util.List;

public interface IClassRoomService {
    List<ClassRoom> getClassRoomList();
    void saveClassRoom(ClassRoom classRoom);
    List<ClassRoomDto> getClassRoomDtoList();
}
