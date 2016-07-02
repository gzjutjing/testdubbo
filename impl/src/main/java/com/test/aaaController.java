package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2016/7/2.
 */
@RestController
public class aaaController {

    @RequestMapping("/aaa")
    public String aaa(){
        return "aaa";
    }
}
