package com.hn.second.dao.impl;

import com.hn.second.commons.ResResult;
import com.hn.second.dao.idao.IUserDao;
import com.hn.second.dao.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoImplTest {
    @Autowired
    IUserDao userDao;
    @Test
    public void login() throws Exception {
        ResResult<User> r1=userDao.login("scott","tiger");
        TestCase.assertNotNull(r1.getData());
        System.out.println(r1);
        ResResult<User> r2=userDao.login("scott2","tiger");
        System.out.println(r2);
    }
}