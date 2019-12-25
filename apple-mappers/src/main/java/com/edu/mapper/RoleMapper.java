package com.edu.mapper;

import com.edu.entity.RoleEntity;
import com.edu.pojo.RolePojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    /**
     * 根据条件查询所有的角色
     * @param roleEntity
     * @return
     */
    public List<RolePojo> queryRoles(RoleEntity roleEntity);

    public List<RolePojo> queryAdminRole(RoleEntity roleEntity);
//添加角色
    public int addRole(RoleEntity roleEntity);
//给角色绑定权限
    public boolean  bindAuths(@Param("rid") int rid ,@Param("auths") int[] auths);

    /**
     * 批量删除用户信息
     * @param ids
     * @return
     */
    public boolean delRole(String[] ids);
}
