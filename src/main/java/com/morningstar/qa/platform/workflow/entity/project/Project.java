package com.morningstar.qa.platform.workflow.entity.project;

import com.morningstar.qa.platform.common.BaseEntity;
import com.morningstar.qa.platform.workflow.entity.testcases.TestData;
import com.morningstar.qa.platform.workflow.entity.testcases.TestSuite;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Project extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Integer projectId;
    private String projectName;
    private List<Env> envs;
    private List<TestData> testData;
}
