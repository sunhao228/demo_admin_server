package com.sunhao.demo_admin.service;

import com.sunhao.demo_admin.entity.Admin;
import java.util.List;

/**
 * @Title:UserService
 * @Description:com.sunhao.demo_admin.service
 * @Auther:孙好
 * @Version:1.0
 * @Create:2020/11/14
 */
public interface AdminService {
    Admin findByUserNameAndPassWord(Admin admin);
    List<Admin> findAllUser();
}
