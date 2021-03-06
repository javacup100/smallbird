package com.smallbird.backend.platform.workflow.mapper;

import com.smallbird.backend.platform.workflow.entity.runtask.TestCaseRunTask;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCaseRunTaskDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TestCaseRunTask record);

    int insertSelective(TestCaseRunTask record);

    TestCaseRunTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestCaseRunTask record);

    int updateByPrimaryKey(TestCaseRunTask record);
}
