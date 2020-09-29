package com.QSJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Package: com.QSJ
 * @ClassName: FeignApplication
 * @Author: SamSung
 * @CreateTime: 2020-09-28 16:56
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
