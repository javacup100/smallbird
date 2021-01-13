package com.smallbird.backend.platform.workflow.mapper;

import com.smallbird.backend.platform.workflow.entity.testcases.TestCaseRun;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCaseRunDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TestCaseRun record);

    int insertSelective(TestCaseRun record);

    TestCaseRun selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestCaseRun record);

    int updateByPrimaryKey(TestCaseRun record);
}
