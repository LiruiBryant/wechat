package com.earyant.sys.userRole.service.impl;

import com.earyant.sys.userRole.controller.vo.UserRoleVo;
import com.earyant.sys.userRole.dao.UserRoleMapper;
import com.earyant.sys.userRole.domain.UserRole;
import com.earyant.sys.userRole.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {
    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserRole record) {
        return userRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(UserRole record) {
        return userRoleMapper.insertSelective(record);
    }

    @Override
    public UserRole selectByPrimaryKey(Integer id) {
        return userRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserRole record) {
        return userRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserRole record) {
        return userRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public UserRole selectByUserId(Integer id) {
        return userRoleMapper.selectByUserId(id);
    }

    @Override
    public int updateByUserId(UserRole userId) {
        return userRoleMapper.updateByUserId(userId);
    }

    @Override
    public List<UserRoleVo> selectByRoleByUserId(UserRoleVo vo) {
        return userRoleMapper.selectByRoleByUserId(vo);
    }

}
