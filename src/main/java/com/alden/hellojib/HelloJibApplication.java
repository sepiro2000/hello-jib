package com.alden.hellojib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloJibApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloJibApplication.class, args);
    }

    @RequestMapping("/")
    public String helloJib() {
        return "hello, jib!";
    }

    @RequestMapping("/divide/{num}")
    public int divide(@PathVariable("num") int num) {
        return 100/num;
    }

}
