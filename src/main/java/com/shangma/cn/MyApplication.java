package com.shangma.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author Michael Lu
 * @Date 2021/1/3 19:17
 * @Description
 */

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.shangma.cn.mapper")
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class);
    }
}
