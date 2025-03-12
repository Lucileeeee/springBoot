package com.spring.hello.model;


public class HelloWord {
    private String value;

    public HelloWord(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
    public void setValue(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }
}
