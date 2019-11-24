package com.van.config;

import com.van.service.impl.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author TangFuwan
 * @date 2019-08-28 21:15
 * @package com.van.config
 */


/**
 * @Configuration： 指明当前类是一个配置类
 */
@Configuration
public class MyAppCinfig {

    /**
     * 生成一个名为helloService的bean
     */
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
