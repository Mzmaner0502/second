package com.hn.second.service.impl;

import com.hn.second.commons.ResResult;
import com.hn.second.dao.idao.IUserDao;
import com.hn.second.dao.pojo.User;
import com.hn.second.service.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
@Autowired
@Qualifier("userDao")
private IUserDao userDao;
    @Override
    public ResResult<User> login(String username, String password) {
      ResResult<User> result = null;
      try{
       result=userDao.login(username,password);
      }catch(Exception e){
         e.printStackTrace();
        }
        return result;
    }
}
