package com.smallbird.backend.platform.auth.mapper;

import com.smallbird.backend.platform.auth.entity.UserPermission;

public interface UserPermissionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPermission record);

    int insertSelective(UserPermission record);

    UserPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPermission record);

    int updateByPrimaryKey(UserPermission record);
}
