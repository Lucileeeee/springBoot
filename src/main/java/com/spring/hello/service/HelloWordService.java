package com.spring.hello.service;

import com.spring.hello.model.HelloWord;
import org.springframework.stereotype.Component;

@Component
public class HelloWordService {

    public HelloWord getHelloWord(){
        return new HelloWord("Coucou le Monde");
    }
}
