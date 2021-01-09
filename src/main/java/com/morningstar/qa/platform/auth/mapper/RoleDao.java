package com.morningstar.qa.platform.auth.mapper;

import com.morningstar.qa.platform.auth.entity.Role;

public interface RoleDao {
    int deleteByPrimaryKey(Integer rid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}