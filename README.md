# Spring Cloud 学习笔记
我根据[方志朋的blog](https://www.fangzhipeng.com/springcloud) 针对2020-11-20日目前spring 所建的项目
搭配blog和项目代码食用更香。

个人感觉spring cloud 的重点还是**架构**,还有和架构对应每个模块的**详细具体的配置**，具体使用上可能就几个注解，
但是我们这只是一个study项目，
没有真实的生产环境，
相当于spring cloud的一个扫盲性项目。

- eureka 服务发现/注册中心
- ribbon/feign 服务调用方式，负载均衡
- Hystrix 熔断降级
- zuul 路由,拦截器等
- config server/client 配置中心
- Bus 广播配置文件