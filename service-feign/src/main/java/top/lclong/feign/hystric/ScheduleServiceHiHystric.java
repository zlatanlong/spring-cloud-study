package top.lclong.feign.hystric;

import org.springframework.stereotype.Component;
import top.lclong.feign.ScheduleServiceHi;

/**
 * @Author: zlatanlong
 * @Date: 2020/11/21 15:46
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {

    @Override
    public String hi() {
        return "sorry 熔断！";
    }
}
