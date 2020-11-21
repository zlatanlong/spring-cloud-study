package top.lclong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lclong.ServiceRibbon;
import top.lclong.service.HiService;

/**
 * @Author: zlatanlong
 * @Date: 2020/11/21 14:20
 */
@RestController
@RequestMapping("/hi")
public class HiController {

    final HiService hiService;

    public HiController(HiService hiService) {
        this.hiService = hiService;
    }

    @GetMapping
    public String hi() {
        return hiService.hi();
    }

    @GetMapping("/1")
    public String hi2() {
        return "123";
    }
}
