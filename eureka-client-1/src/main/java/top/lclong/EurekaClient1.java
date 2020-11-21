package top.lclong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zlatanlong
 * @Date: 2020/11/20 23:09
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClient1 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1.class, args);
    }
}
