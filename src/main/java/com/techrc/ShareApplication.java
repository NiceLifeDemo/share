package com.techrc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@MapperScan("com.techrc.mapper")
public class ShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareApplication.class, args);
	}
}
