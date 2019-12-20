package com.lhz.api.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.zookeeper.ConditionalOnZookeeperEnabled;
import org.springframework.cloud.zookeeper.discovery.ConditionalOnZookeeperDiscoveryEnabled;

/**
 * @Auther: lhz
 * @Date: 2019/12/7 0007 15:52
 * @Description: member启动类
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppMember {
    //@EnableDiscoveryClient 要想将一个微服务注册到Eureka Server（或其他服务发现组件，例如Zookeeper、Consul等
    public static void main(String[] args) {
        SpringApplication.run(AppMember.class, args);
    }
}
