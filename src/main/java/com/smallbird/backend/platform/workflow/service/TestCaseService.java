package com.smallbird.backend.platform.workflow.service;

import com.smallbird.backend.platform.workflow.entity.testcases.TestCase;
import com.smallbird.backend.platform.workflow.mapper.TestCaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestCaseService {
    @Autowired
    private TestCaseDao testCaseDao;

    public int deleteCase(Integer id) {
        return testCaseDao.deleteByPrimaryKey(id);
    }

    public int insertCase(TestCase record) {
        return testCaseDao.insert(record);
    }


    public TestCase selectCase(Integer id) {
        return testCaseDao.selectByPrimaryKey(id);
    }

    public int updateCase(TestCase record) {
        return testCaseDao.updateByPrimaryKey(record);
    }
}
