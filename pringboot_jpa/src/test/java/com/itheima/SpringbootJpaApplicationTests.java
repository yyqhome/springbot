package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJpaApplicationTests {

    @Autowired
    UserDao userDao;
    @Test
    public void contextLoads() {
        List<User> conditionSql = userDao.findConditionSql("%s%");
        System.out.println(conditionSql);
    }

}
