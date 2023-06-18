package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.objenesis.ObjenesisException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@RestController
public class Animal {

    @Autowired
    @Qualifier("Blue")
    Cat C1;

    @Autowired
    @Qualifier("Brown")
    Cat C2;

    StringBuilder Objects = new StringBuilder();


    @GetMapping("API1")
    public String getColor1()
    {
        Objects.append(C1.toString());
        return C1.getColor() + " " + C1.toString();
    }

    @GetMapping("API2")
    public String getColor2()
    {
        Objects.append(C2.toString());
        return C2.getColor() + " " + C2.toString();
    }


    public String printObjects()
    {
        return Objects.toString();
    }

}
