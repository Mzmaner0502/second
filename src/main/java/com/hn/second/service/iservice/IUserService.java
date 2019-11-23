package com.hn.second.service.iservice;

import com.hn.second.commons.ResResult;
import com.hn.second.dao.pojo.User;

public interface IUserService {
    ResResult<User> login(String username, String password);
}
