package top.lclong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lclong.feign.ScheduleServiceHi;

/**
 * @Author: zlatanlong
 * @Date: 2020/11/21 15:20
 */
@RequestMapping("/hi")
@RestController
public class HiController {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;


    @GetMapping
    public String hi() {
        return scheduleServiceHi.hi();
    }

}
