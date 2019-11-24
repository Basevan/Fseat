package com.van.controller;

import com.alibaba.fastjson.JSONObject;
import com.van.model.User;
import com.van.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author TangFuwan
 * @date 2019-07-23 15:51
 * @package com.van.controller
 */
@CrossOrigin(origins = {"*","null"})
@RestController
public class pageController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/hello- world")
    public String Hello() {
        return "hello world!";
    }

    @RequestMapping("/getUser")
    public JSONObject Login() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from student");
        return BaseResult.success(list);
    }

    @RequestMapping("/login")
    public JSONObject login(@Valid User user, BindingResult bindingResult) {
        StringBuffer stringBuffer = new StringBuffer();
        if(bindingResult.hasErrors()){
            List<ObjectError> list =bindingResult.getAllErrors();
            for (ObjectError objectError:list) {
                stringBuffer.append(objectError.getDefaultMessage());
                stringBuffer.append("---");
            }
            return BaseResult.fail(stringBuffer.toString());
        }
        else {
            return BaseResult.success();
        }
    }

    @RequestMapping("/logout")
    public void logout() {

    }

    @RequestMapping("/redis")
    public String testRedis(){
        User user = new User();
        user.setUserName("basevan");
        user.setPhone("15730037233");
        user.setUserMail("183320926@qq.com");
        redisTemplate.opsForValue().set("user",JSONObject.toJSONString(user),50, TimeUnit.SECONDS);

        User user1 = JSONObject.parseObject(redisTemplate.opsForValue().get("user"),User.class);

        System.out.println(user1);

        return redisTemplate.opsForValue().get("user");

    }
}