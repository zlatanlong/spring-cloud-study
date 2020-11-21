package top.lclong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zlatanlong
 * @Date: 2020/11/20 23:11
 */
@RestController
@RequestMapping("/hi")
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping
    public String hi() {
        return "port " + port;
    }
}
