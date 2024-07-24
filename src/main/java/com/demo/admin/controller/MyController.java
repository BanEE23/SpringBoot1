package com.demo.admin.controller;

import com.demo.admin.entity.Contact;
import com.demo.admin.repository.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MyController {
    @Autowired
    private MyRepo myRepo;
    @GetMapping(value = "/v1/HomePage")
    public String GetDetails(){
        return "Hello World";
    }
   @GetMapping(value = "/v1/contactDetails")
    public List<Contact> GetContactDetails(){
        return myRepo.findDetials();
    }

}
