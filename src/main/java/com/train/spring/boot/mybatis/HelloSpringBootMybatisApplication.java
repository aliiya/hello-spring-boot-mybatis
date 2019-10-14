package com.train.spring.boot.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * MapperScan ：指定 Mapper 接口的路径
 */
@MapperScan(basePackages = "com.train.spring.boot.mybatis.dao")
@SpringBootApplication
public class HelloSpringBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootMybatisApplication.class, args);
	}

}
