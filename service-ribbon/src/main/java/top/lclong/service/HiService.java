package top.lclong.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zlatanlong
 * @Date: 2020/11/21 14:16
 */
@Service
public class HiService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi() {
        return restTemplate.getForObject("http://SERVICE-CLIENT/hi", String.class);
    }


    public String hiError() {
        return "sorry,error!";
    }
}
