package com.sunhao.demo_admin.controller;

import com.sunhao.demo_admin.dao.AdminMapper;
import com.sunhao.demo_admin.entity.Admin;
import com.sunhao.demo_admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @Title:UserController
 * @Description:com.sunhao.demo_admin.controller
 * @Auther:孙好
 * @Version:1.0
 * @Create:2020/11/14
 */
@RestController
@RequestMapping(value = "/admin", method = RequestMethod.GET)
public class AdminController {

    @Autowired
    private AdminMapper adminMapper;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Admin login(HttpServletRequest req){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Admin admin = new Admin();
        admin.setName(username);
        admin.setPassWord(password);
        return adminMapper.queryByUserNameAndPassWord(admin);
    }
    @RequestMapping(value = "/searchAllUser", method = RequestMethod.POST)
    public List<Admin> searchAllUser(){
        return adminMapper.queryAll();
    }
}
