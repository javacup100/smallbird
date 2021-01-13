package com.smallbird.backend.platform.workflow.entity.testcases;

import com.smallbird.backend.platform.common.BaseEntity;
import java.util.Set;

public class TestSuite extends BaseEntity {

    private String suiteName;

    private int suiteId;

    private Set<Integer> caseId;

}
