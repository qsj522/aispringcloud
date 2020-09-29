package com.QSJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Package: com.QSJ
 * @ClassName: RestTemplateApplicaton
 * @Author: SamSung
 * @CreateTime: 2020-09-27 16:16
 * @Description:
 */
@SpringBootApplication
public class RestTemplateApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplicaton.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
