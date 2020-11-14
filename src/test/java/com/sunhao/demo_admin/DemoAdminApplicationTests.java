package com.sunhao.demo_admin;

import com.sunhao.demo_admin.dao.AdminMapper;
import com.sunhao.demo_admin.entity.Admin;
import com.sunhao.demo_admin.service.AdminService;
import com.sunhao.demo_admin.service.impl.AdminServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoAdminApplicationTests {
    @Autowired
    AdminService adminService;
    @Test
    void contextLoads() {
        List<Admin> list =adminService.findAllUser();
        for(Admin data:list)    {
            System.out.println(data.toString());
        }
    }

}
