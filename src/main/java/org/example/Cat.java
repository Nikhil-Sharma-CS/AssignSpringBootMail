package org.example;

import org.springframework.stereotype.Component;


public class Cat {

    private String color = "Brown";

    public Cat(String color)
    {
        this.color = color;
        System.out.println("Cat is made of color " + color);
    }

    public String getColor()
    {
        return color;
    }

}
