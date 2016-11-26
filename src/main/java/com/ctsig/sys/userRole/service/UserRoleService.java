package com.ctsig.sys.userRole.service;

import java.util.List;

import com.ctsig.sys.userRole.domain.UserRole;

import com.ctsig.sys.userRole.controller.vo.UserRoleVo;


public interface UserRoleService {
	 int deleteByPrimaryKey(Integer id);

	    int insert(UserRole record);

	    int insertSelective(UserRole record);
	    
	    

	    UserRole selectByPrimaryKey(Integer id);
	    UserRole selectByUserId(Integer id);

	    int updateByPrimaryKeySelective(UserRole record);

	    int updateByPrimaryKey(UserRole record);
	    int updateByUserId(UserRole userId);
	    List<UserRoleVo> selectByRoleByUserId(UserRoleVo vo);
}