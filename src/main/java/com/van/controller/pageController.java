package com.van.controller;

import com.alibaba.fastjson.JSONObject;
import com.van.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author TangFuwan
 * @date 2019-07-23 15:51
 * @package com.van.controller
 */
@CrossOrigin(origins = {"*","null"})
@RestController
@RequestMapping("/Fseat")
public class pageController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/hello")
    public String Hello(){
        return "hello world!";
    }

    @RequestMapping("/login")
    public JSONObject Login(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from student");
        return BaseResult.success(list);
    }

    @RequestMapping("/logout")
    public JSONObject logout(){
        return BaseResult.success("this is successful page");
    }
}
