package com.ngsprogram.myprogram;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class MyprogramController {

    
    
    @RequestMapping("/hello")
    public String hello()
    {
        return "Welcome to NGS";
    }
}
