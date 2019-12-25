package com.edu.serivce.impl;

import com.edu.entity.RoleEntity;
import com.edu.pojo.RolePojo;
import com.edu.serivce.IRoleService;
import com.github.pagehelper.PageHelper;
import com.edu.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    RoleMapper roleMapper;

    /**
     * 根据条件查询所有的角色
     * @param roleEntity
     * @return
     */
    public List<RolePojo> queryRoles(RoleEntity roleEntity){

        if(null != roleEntity){
            PageHelper.startPage(roleEntity.getPageNum(),roleEntity.getPageSize());
        }

        return roleMapper.queryRoles(roleEntity);
    }

    /**
     * 根据条件分页查询我们的角色列表
     * @param
     * @return 角色列表
     */
    public List<RolePojo> queryAdminRole(RoleEntity roleEntity) {
        PageHelper.startPage(roleEntity.getPageNum(),roleEntity.getPageSize());
        return roleMapper.queryAdminRole(roleEntity);
    }

    @Override
    public boolean addRole(RoleEntity roleEntity) {
        // 添加用户
      int ap =  roleMapper.addRole(roleEntity);
        //给角色绑定权限
      boolean b1 =  roleMapper.bindAuths(roleEntity.getRid(),roleEntity.getAuthids());
        return b1;
    }
    /**
     * 批量删除用户信息
     * @param ids
     * @return
     */
    public boolean delRole(String[] ids){
        return roleMapper.delRole(ids);
    }

}
