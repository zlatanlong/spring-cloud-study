package top.lclong.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import top.lclong.feign.hystric.ScheduleServiceHiHystric;

/**
 * @Author: zlatanlong
 * @Date: 2020/11/21 15:18
 */
@FeignClient(value = "service-client/hi", fallback = ScheduleServiceHiHystric.class)
public interface ScheduleServiceHi {

    @GetMapping
    String hi();

}
