package org.fai.study.demo_wcd_02.services;

import org.fai.study.demo_wcd_02.dtos.ClassRoomDto;
import org.fai.study.demo_wcd_02.entities.ClassRoom;
import org.fai.study.demo_wcd_02.repositories.IClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService implements IClassRoomService {
    @Autowired
    private IClassRoomRepository classRoomRepository;
    @Override
    public List<ClassRoom> getClassRoomList() {
        var classRoomList = classRoomRepository.findAll();
        return classRoomList;
    }

    @Override
    public void saveClassRoom(ClassRoom classRoom) {
        try {
            classRoomRepository.save(classRoom);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<ClassRoomDto> getClassRoomDtoList() {
        List<ClassRoomDto> classRooomDtoList = (List<ClassRoomDto>) classRoomRepository.findAllClassRoom();
        return classRooomDtoList;
    }
}
