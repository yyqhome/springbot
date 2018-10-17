package com.itheima.dao;

import com.itheima.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: YYQ
 * @Description:
 * @Date: Create in 2018/10/16  19:31
 * @Modified By:
 */
public interface UserDao extends JpaRepository<User,Integer> ,JpaSpecificationExecutor<User> {
}
