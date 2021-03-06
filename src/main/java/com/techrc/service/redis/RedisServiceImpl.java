package com.techrc.service.redis;

import com.techrc.model.RedisModel;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl  extends IRedisService<RedisModel> {
    private static final String REDIS_KEY = "TEST_REDIS_KEY";

    @Override
    protected String getRedisKey() {
        return this.REDIS_KEY;
    }
}
