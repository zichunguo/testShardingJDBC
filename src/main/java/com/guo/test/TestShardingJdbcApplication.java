package com.guo.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guo.test.mapper")
public class TestShardingJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestShardingJdbcApplication.class, args);
	}
	
	public void test() {
		System.out.println("hello");
	}

}
