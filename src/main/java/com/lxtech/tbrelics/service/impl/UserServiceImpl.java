package com.lxtech.tbrelics.service.impl;

import com.lxtech.tbrelics.domain.LUser;
import com.lxtech.tbrelics.mapper.LUserMapper;
import com.lxtech.tbrelics.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private LUserMapper lUserMapper;

    @Override
    public LUser findUser(String username, String password) throws Exception {
        LUser lUser = lUserMapper.selectByUsernameAndPassword(username,password);
        return lUser;
    }
}
