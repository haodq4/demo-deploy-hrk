package com.dangbac.demodeployhrk.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "<center><h1>deploy in Heroku<h1/><center/> <br/> <center><h1>Hello <h1/><center/>";
    }
}
