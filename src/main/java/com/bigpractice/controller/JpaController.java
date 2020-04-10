package com.bigpractice.controller;

import com.bigpractice.pojo.Door;
import com.bigpractice.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: BigPractice
 * @author: fei
 * @description:
 * @create: 2020-04-10 15:39
 */

@Controller
public class JpaController {

    @Autowired
    JpaService jpaService;
    @RequestMapping("/list")
    public String showDoor(Integer id) {

        System.out.println(id);
        Door door = jpaService.findById(id);

        System.out.println(door);
        return "1";
    }
}
