package com.jk.qyq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix //开启断路器可用
public class SpringcloudClientRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClientRibbonApplication.class, args);
    }
    /**
     * 一般在使用SpringCloud的时候不需要自己手动创建HttpClient来进行远程调用。
     * 可以使用Spring封装好的RestTemplate工具类
     *
     * 将RestTemplate注入到spring容器中
     * LoadBalanced负载均衡默认为轮询
     *
     * 用restTemplate访问restful接口非常的简单。
     * (url, requestMap, ResponseBean.class)
     * 这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    //写在这里，跟之前写在配置类中是一样的，@Configuration

}
