package com.van.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Author TangFuwan
 * @date 2019-08-01 17:22
 * @package com.van.utils
 */
@Component
public class RedisUtils {

    @Autowired
    private StringRedisTemplate redisTemplate;


}
