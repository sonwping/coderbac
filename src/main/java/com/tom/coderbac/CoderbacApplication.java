package com.tom.coderbac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackages = {"com.tom.coderbac" } )
@MapperScan(basePackages = {"com.tom.code22" } )
public class CoderbacApplication {

	public static void main(String[] args) {
		System.out.println("=============begin to start");
		SpringApplication.run(CoderbacApplication.class, args);
	}

}
