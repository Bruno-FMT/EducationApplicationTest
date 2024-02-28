package br.com.fullstack.eduation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldControler {

    @GetMapping
    public String hello(){
        return "Hello World \\o/";
    }
}
