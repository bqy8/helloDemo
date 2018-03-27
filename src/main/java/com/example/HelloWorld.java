package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by y on 2018/3/7.
 */

@SpringBootApplication
@RestController
public class HelloWorld {


    public static void main(String[] args){
        SpringApplication.run(HelloWorld.class,args);
    }


    @RequestMapping("/")
    public String hello(){
        return "HelloWorld";

    }
}
