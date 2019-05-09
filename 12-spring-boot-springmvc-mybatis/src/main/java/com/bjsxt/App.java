package com.bjsxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bjsxt.mapper") //@MapperScan 用户扫描MyBatis的Mapper接口
public class App {
	/**
	 * 在IntelliJ IDEA下，mapper接口和mapper.xml放在同一个目录下，不能跑起来 —— 20190509
	 */

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
