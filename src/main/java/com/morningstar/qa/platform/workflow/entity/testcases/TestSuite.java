package com.morningstar.qa.platform.workflow.entity.testcases;

import com.morningstar.qa.platform.common.BaseEntity;
import java.util.Set;

public class TestSuite extends BaseEntity {

    private String suiteName;

    private int suiteId;

    private Set<Integer> caseId;

}
