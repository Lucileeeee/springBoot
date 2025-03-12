package com.spring.hello;

import com.spring.hello.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {
    @Autowired
    private HelloWordService hellowordService;

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }//laisser toujour vide la main, on envoie dans run

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello le monde");
        hellowordService.getHelloWord();
    }
}
