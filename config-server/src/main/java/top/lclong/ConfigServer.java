package top.lclong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zlatanlong
 * @Date: 2020/11/21 16:23
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }

}
