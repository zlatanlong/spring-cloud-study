package top.lclong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: zlatanlong
 * @Date: 2020/11/21 16:02
 */
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceZuul {
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuul.class, args);
    }
}
