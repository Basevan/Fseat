package com.van;

import com.van.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FseatApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext applicationContext;

    //logger-日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test(){

        boolean isExist = applicationContext.containsBean("helloService");
        System.out.println(isExist);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void contextLoads01(){
        //日志级别
        //从低到高 trace<debug<info<warn<error
        logger.trace("这是trance日志");
        logger.debug("debug log");
        //springboot 默认使用info级别的，默认只会输出info以后的日志
        logger.info("this is info log");
        logger.warn("this is warn log");
        logger.error("this is error log");
    }

}
