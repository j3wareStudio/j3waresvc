package com.j3ware.sf.restful_webservices.controller;

public class HelloWorlBean {
    private String message;

    public HelloWorlBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void stMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "HelloWorlBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
