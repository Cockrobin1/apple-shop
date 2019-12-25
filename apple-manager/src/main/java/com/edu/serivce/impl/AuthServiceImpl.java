package com.edu.serivce.impl;



import com.edu.entity.AuthEntity;
import com.edu.mapper.AuthMapper;
import com.edu.pojo.AuthPojo;
import com.edu.serivce.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements IAuthService {

    @Autowired
    AuthMapper authMapper;


    public List<AuthPojo> queryAuths(AuthEntity authEntity) {

        return authMapper.queryAuths(authEntity);
    }
}
