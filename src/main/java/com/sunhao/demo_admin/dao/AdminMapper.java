package com.sunhao.demo_admin.dao;

import com.sunhao.demo_admin.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Title:UserMapper
 * @Description:com.sunhao.demo_admin.dao
 * @Auther:孙好
 * @Version:1.0
 * @Create:2020/11/14
 */
@Mapper
@Repository
public interface AdminMapper {

    @Select("select * from admin where name=#{name},passWord=#{password}")
    Admin queryByUserNameAndPassWord(Admin admin);

    @Select("select * from admin")
    List<Admin> queryAll();
}
