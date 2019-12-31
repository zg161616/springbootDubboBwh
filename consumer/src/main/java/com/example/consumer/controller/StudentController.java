package com.example.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Reference(version = "1.0.0")
    private StudentService studentService;


    @RequestMapping("/get")
    public String get(@RequestParam(value="id",required=false)int id){

            return studentService.info(id);
    }
}