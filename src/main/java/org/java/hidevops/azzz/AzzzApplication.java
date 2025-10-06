package org.java.hidevops.azzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class AzzzApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzzzApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @RequestMapping("/hi")
    public String hi() {
        return "Hi, World!";
    }
}
