package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

import javax.annotation.Resource;

/**
 * @author bwh
 * @date 2020/1/2/002 - 15:08
 * @Description
 */
@RestController
public class StudentController {
    @Resource
    StudentService studentService;

    @RequestMapping("/get")
    public String get(@RequestParam(value="id",required=false)int id){
        return studentService.info(id);
    }


}
