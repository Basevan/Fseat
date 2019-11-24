package com.van.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author TangFuwan
 * @date 2019-08-28 21:08
 * @package com.van.controller
 */
@RestController
public class helloController {

    @Value("${person.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "hello" + name;
    }

}
