package com.itheima.controller;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: YYQ
 * @Description:
 * @Date: Create in 2018/10/16  19:33
 * @Modified By:
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;



    @RequestMapping("/list")
    public List<User> list(){
        List<User> all = userDao.findAll();
        System.out.println(all);
        return all;
    }
}
