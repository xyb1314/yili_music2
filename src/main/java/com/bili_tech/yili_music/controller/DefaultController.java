package com.bili_tech.yili_music.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 接口类
@RequestMapping("/hello")
public class DefaultController {


    //get function ... when you get the url in the browser ,"hello" will show up
    @GetMapping
    public String sayhello(){

        return "hello";
    }

//    @GetMapping("/2")
//    public String sayno(){
//        return "no";
//    }


}
