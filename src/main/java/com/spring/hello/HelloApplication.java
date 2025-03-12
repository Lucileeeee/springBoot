package com.spring.hello;

import com.spring.hello.service.HelloWordService;
import com.spring.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.spring.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {
    @Autowired
    HelloWordService hellowordService;
    @Autowired
    private LivreService livreService;

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }//laisser toujour vide la main, on envoie dans run

    @Override
    public void run(String... args) throws Exception {
       // System.out.println("Hello le monde");
       // System.out.println(hellowordService.getHelloWord());
        livreService.add();
    }
}
