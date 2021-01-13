package com.smallbird.backend.platform.auth.mapper;

import com.smallbird.backend.platform.auth.entity.RequestPathPermissionRelation;

public interface RequestPathPermissionRelationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(RequestPathPermissionRelation record);

    int insertSelective(RequestPathPermissionRelation record);

    RequestPathPermissionRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RequestPathPermissionRelation record);

    int updateByPrimaryKey(RequestPathPermissionRelation record);
}