package com.xunjer.alinsen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AlinsenApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlinsenApplication.class, args);
    }

}
