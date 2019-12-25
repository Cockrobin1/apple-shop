package com.edu.mapper;

import com.edu.entity.AuthEntity;
import com.edu.pojo.AuthPojo;

import java.util.List;

public interface AuthMapper {

    public List<AuthPojo> queryAuths(AuthEntity adminEntity);
}