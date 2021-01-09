package com.morningstar.qa.platform.workflow.service;

import com.morningstar.qa.platform.workflow.entity.runtask.TestCaseRunTask;
import com.morningstar.qa.platform.workflow.entity.testcases.TestCase;
import com.morningstar.qa.platform.workflow.entity.testcases.TestCaseRun;
import com.morningstar.qa.platform.workflow.mapper.TestCaseDao;
import com.morningstar.qa.platform.workflow.mapper.TestCaseRunDao;
import com.morningstar.qa.platform.workflow.mapper.TestCaseRunTaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestCaseRunService {
    @Autowired
    private TestCaseRunDao testCaseRunDao;
    @Autowired
    private TestCaseRunTaskDao testCaseRunTaskDao;

    public int deleteCaseRun(Integer id) {
        return testCaseRunDao.deleteByPrimaryKey(id);
    }

    public int insertCaseRun(TestCaseRun record) {
        return testCaseRunDao.insert(record);
    }


    public TestCaseRun selectCaseRun(Integer id) {
        return testCaseRunDao.selectByPrimaryKey(id);
    }

    public int updateCaseRun(TestCaseRun record) {
        return testCaseRunDao.updateByPrimaryKey(record);
    }

    public int insertCaseRunTask(TestCaseRunTask record) {
        return testCaseRunTaskDao.insert(record);
    }


    public TestCaseRunTask selectCaseRunTask(Integer id) {
        return testCaseRunTaskDao.selectByPrimaryKey(id);
    }

    public int updateCaseRun(TestCaseRunTask record) {
        return testCaseRunTaskDao.updateByPrimaryKey(record);
    }
}
