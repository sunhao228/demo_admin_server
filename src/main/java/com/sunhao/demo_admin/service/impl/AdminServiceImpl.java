package com.sunhao.demo_admin.service.impl;

import com.sunhao.demo_admin.dao.AdminMapper;
import com.sunhao.demo_admin.entity.Admin;
import com.sunhao.demo_admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title:UserServiceImpl
 * @Description:com.sunhao.demo_admin.service.impl
 * @Auther:孙好
 * @Version:1.0
 * @Create:2020/11/14
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findByUserNameAndPassWord(Admin admin) {
        return adminMapper.queryByUserNameAndPassWord(admin);
    }

    @Override
    public List<Admin> findAllUser() {
        return adminMapper.queryAll();
    }
}
