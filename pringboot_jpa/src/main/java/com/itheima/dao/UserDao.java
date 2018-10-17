package com.itheima.dao;

import com.itheima.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: YYQ
 * @Description:
 * @Date: Create in 2018/10/16  19:31
 * @Modified By:
 */
public interface UserDao extends JpaRepository<User,Integer> ,JpaSpecificationExecutor<User> {

    @Query(value = "select * from user where id = ? limit 1",nativeQuery = true)
    User findByUserId(Integer id);
    @Query(value = "select * from user where username like ?",nativeQuery = true)
    List<User> findConditionSql(String name);
}
