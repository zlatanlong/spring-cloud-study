package top.lclong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author: zlatanlong
 * @Date: 2020/11/21 14:14
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class ServiceRibbon {
    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbon.class, args);
    }
}
