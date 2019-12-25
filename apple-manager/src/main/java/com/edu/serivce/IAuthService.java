package com.edu.serivce;

import com.edu.entity.AuthEntity;
import com.edu.pojo.AuthPojo;

import java.util.List;

public interface IAuthService {


    /*
      得到角色权限
     */
   public List<AuthPojo> queryAuths(AuthEntity authEntity);
}
