package org.fai.study.demo_wcd_02.controllers;

import org.fai.study.demo_wcd_02.services.IClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/classroom")

public class ClassRoomController {
    @Autowired
    IClassRoomService classRoomService;
    public ClassRoomController(IClassRoomService classRoomService) {
        this.classRoomService = classRoomService;
    }
    @GetMapping("/index")
    String Index(Model model){
        var classRooms = this.classRoomService.getClassRoomDtoList();
        model.addAttribute("classRooms", classRooms);
        return "monitor/class/indexClass";
    }
}
