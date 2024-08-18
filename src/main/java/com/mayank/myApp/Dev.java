package com.mayank.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Accessing laptop class   
    @Autowired
    private Laptop laptop;

    public void build(){
        System.out.println("Hello Aliens");
        laptop.compile();
    }


    //contructor injection
    // public Dev(Laptop laptop){
    //     this.laptop = laptop;
    // }

    // Setter injection

    // public void setLaptop(Laptop laptop){
    //     this.laptop = laptop;
    // }


}
