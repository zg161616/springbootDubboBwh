package com.example.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Reference(version = "1.0.0")
    private StudentService studentService;
    @Autowired
    RestTemplate restTemplate;



    @RequestMapping("/get")
    public String get(@RequestParam(value="id",required=false)int id){

            return studentService.info(id);
    }

    @RequestMapping("/info")
    public String info(@RequestParam(value="id",required=false)int id){
        String s = restTemplate.getForObject("http://provider/get?id="+id, String.class);
        return s;
    }
}