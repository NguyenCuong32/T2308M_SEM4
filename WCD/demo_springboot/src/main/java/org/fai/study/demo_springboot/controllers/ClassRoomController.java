package org.fai.study.demo_springboot.controllers;

import org.fai.study.demo_springboot.dtos.ClassRoomDto;
import org.fai.study.demo_springboot.entities.ClassRoom;
import org.fai.study.demo_springboot.services.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/classroom")
public class ClassRoomController {
    @Autowired
    private ClassRoomService classRoomService;
    public ClassRoomController() {

    }
    @GetMapping("/list")
    public List<ClassRoom> findAll() {
      var classRooms =  classRoomService.getClassRoomList();
      return classRooms;
    }
    @GetMapping("/listdto")
    public List<ClassRoomDto> findAllDto() {
        List<ClassRoomDto> classRooms =  classRoomService.getClassRoomDtoList();
        return classRooms;
    }
    @PostMapping("/save")
    public void save(@RequestBody ClassRoom classRoom) {
        try {
            classRoomService.saveClassRoom(classRoom);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
