package com.lhz.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lhz
 * @Date: 2019/12/7 0007 15:50
 * @Description:
 * @Version: 1.0
 */
@RestController
public class ZkMemberApiController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getMember")
    public String getMember() {
        return "this is member 端口号为：" + serverPort;
    }
}
