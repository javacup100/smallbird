package com.smallbird.backend.platform.auth.mapper;

import com.smallbird.backend.platform.auth.entity.RequestPath;

public interface RequestPathDao {
    int deleteByPrimaryKey(Integer id);

    int insert(RequestPath record);

    int insertSelective(RequestPath record);

    RequestPath selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RequestPath record);

    int updateByPrimaryKey(RequestPath record);
}