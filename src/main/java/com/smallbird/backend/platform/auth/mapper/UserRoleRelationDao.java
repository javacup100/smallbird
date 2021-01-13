package com.smallbird.backend.platform.auth.mapper;

import com.smallbird.backend.platform.auth.entity.UserRoleRelation;

public interface UserRoleRelationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleRelation record);

    int insertSelective(UserRoleRelation record);

    UserRoleRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRoleRelation record);

    int updateByPrimaryKey(UserRoleRelation record);
}