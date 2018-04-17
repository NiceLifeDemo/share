package com.techrc.config;




import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;

@Configuration
public class ShiroConfig {

    /**
     * ehcache缓存方案<br/>
     * 简单的缓存,后续可更换为redis缓存,通过自己实现shiro的CacheManager接口和Cache接口
     *
     * @return
     */
    @Bean
    public CacheManager shiroEhCacheManager() {
        EhCacheManager cacheManager = new EhCacheManager();
        cacheManager.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
        return cacheManager;
    }

}
