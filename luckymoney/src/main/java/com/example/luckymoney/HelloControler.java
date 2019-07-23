package com.example.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/Hello")
public class HelloControler {
    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say")
    public String say(@RequestParam(value = "id",required = false, defaultValue = "0") Integer id){
//        return "说明"+limitConfig.getDescription();
//        return "index";
        return "id"+id;
    }

}
