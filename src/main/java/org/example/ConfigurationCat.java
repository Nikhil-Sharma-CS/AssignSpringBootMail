package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationCat {

    @Bean("Blue")       //This creates the bean of type Cat as mentioned in return statement
    public Cat getCatObject1()
    {
        System.out.println("Inside bean method getCatObject1");
        return new Cat("Blue");
    }

    @Bean("Brown")
    public Cat getCatObject2()
    {
        System.out.println("Inside bean method getCatObject2");
        return new Cat("Brown");
    }

}
