package com.morningstar.qa.platform.workflow.mapper;

import com.morningstar.qa.platform.workflow.entity.testcases.TestCase;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCaseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TestCase record);

    int insertSelective(TestCase record);

    TestCase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestCase record);

    int updateByPrimaryKey(TestCase record);
}
