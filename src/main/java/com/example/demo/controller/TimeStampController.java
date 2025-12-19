package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TImeStampEntity;

@RestController
public class TimeStampController{
     @Autowired StudentService ser; 
   @PostMapping("/post")
   public StudentEntity sendData(@RequestBody StudentEntity stu){
     return ser.postData(stu);
   }
}