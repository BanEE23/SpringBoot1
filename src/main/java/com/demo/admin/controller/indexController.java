package com.demo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // @RestController not working for html pages, so create new controller page
public class indexController {
    @GetMapping(value = "/v1/indexPage")
    public String index(){
        return "index";
    }
}
