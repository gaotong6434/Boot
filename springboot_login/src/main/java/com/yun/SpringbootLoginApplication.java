package com.yun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@MapperScan("com.yun.dao")
@ComponentScan(basePackages = {"com.yun.entity"})
public class SpringbootLoginApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootLoginApplication.class, args);
    }

}
