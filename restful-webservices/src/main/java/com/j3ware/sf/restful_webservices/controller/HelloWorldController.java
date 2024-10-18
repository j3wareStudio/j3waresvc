package com.j3ware.sf.restful_webservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path= "/hello-World")
    public String helloWordl (){
        return "Hello world Culey";
    }

    @GetMapping(path= "/hello-World-bean")
    public HelloWorlBean helloWordlBean (){
        return new HelloWorlBean("Hello world Culey");
    }

    @GetMapping(path= "/hello-World/path-variable/{name}")
    public HelloWorlBean helloWordlPathVariable (@PathVariable String name) {
        return new HelloWorlBean(String.format("Hello world Culey, %s", name ));
    }




}
