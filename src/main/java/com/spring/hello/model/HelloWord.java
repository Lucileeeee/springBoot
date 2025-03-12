package com.spring.hello.model;

public class HelloWord {
    private String value;

    public HelloWord(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
    public String setValue(String value){
        return this.value = value;
    }

    public String toString(){
        return value;
    }
}
