package com.earyant.sys.privilege.dao;

import com.earyant.sys.privilege.domain.Privilege;

import java.util.List;

public interface PrivilegeMapper {
    int deleteByPrimaryKey(String id);

    int deleteByPid(String id);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    Privilege selectByPrimaryKey(String id);

    List<Privilege> selectByPid(String id);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);

    List<Privilege> selectAllPrivilege();
}