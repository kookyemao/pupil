package com.example.oraclemybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.oraclemybatis.dao")
public class OracleMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(OracleMybatisApplication.class, args);
    }

}
