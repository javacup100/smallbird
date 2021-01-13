package com.smallbird.backend.platform.auth.mapper;

import com.smallbird.backend.platform.auth.entity.RolePermissionRelation;

public interface RolePermissionRelationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermissionRelation record);

    int insertSelective(RolePermissionRelation record);

    RolePermissionRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermissionRelation record);

    int updateByPrimaryKey(RolePermissionRelation record);
}