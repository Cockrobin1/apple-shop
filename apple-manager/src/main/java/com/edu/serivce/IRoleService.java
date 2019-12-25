package com.edu.serivce;

import com.edu.entity.RoleEntity;
import com.edu.pojo.RolePojo;

import java.util.List;

public interface IRoleService {

    /**
     * 根据条件查询所有的角色
     * @param roleEntity
     * @return
     */
    public List<RolePojo> queryRoles(RoleEntity roleEntity);

 //分页查询角色列表
    public List<RolePojo> queryAdminRole(RoleEntity roleEntity);
//添加角色
     public boolean addRole(RoleEntity roleEntity);

    /**
     * 批量删除用户信息
     * @param ids
     * @return
     */
    public boolean delRole(String[] ids);
}
