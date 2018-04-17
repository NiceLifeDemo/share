package com.techrc;


import com.techrc.model.RedisModel;
import com.techrc.service.redis.RedisServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShareApplicationTests {

	@Autowired
	private RedisServiceImpl service;
	@Test
	public void contextLoads() {
		//-9217695746604105425
		RedisModel redisModel=service.get("zhangsanKey01");
         System.out.println(redisModel);

	}



	}
