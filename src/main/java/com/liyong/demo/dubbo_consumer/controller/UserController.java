package com.liyong.demo.dubbo_consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liyong.demo.apis.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>ClassName com.liyong.demo.dubbo_consumer.controller.UserController              </p>
 * <p>Description 用户的接口                     </p>
 * <p>Author liyong                                  </p>
 * <p>Date 2018-12-29 16:31                           </p>
 * <p>Version 0.0.1                                  </p>
 **/
@RequestMapping(value = "/user")
@RestController
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping(value = "/list")
    public List<String> getUsers() {
        return userService.getUsers(1);
    }
}
