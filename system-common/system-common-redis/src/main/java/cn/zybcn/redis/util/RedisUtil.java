package cn.zybcn.redis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author 程序员小张
 * @Date 2022-09-13 23:46
 */
public class RedisUtil {


    @Autowired
    private RedisTemplate redisTemplate;
}
