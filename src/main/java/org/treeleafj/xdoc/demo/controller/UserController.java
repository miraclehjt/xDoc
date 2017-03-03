package org.treeleafj.xdoc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.treeleafj.xdoc.demo.vo.User;

/**
 * 用户模块
 *
 * @author leaf
 * @date 2017-03-03 10:11
 */
@Controller
@RequestMapping("user")
public class UserController {

    /**
     * 注册用户
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户注册后的信息
     * @see org.treeleafj.xdoc.demo.vo.User
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public User register(User user, int num, String username, String password) {
        return null;
    }
}