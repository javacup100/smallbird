package com.smallbird.backend.platform.workflow.entity.project;

import com.smallbird.backend.platform.common.BaseEntity;
import com.smallbird.backend.platform.workflow.entity.testcases.TestData;
import lombok.Data;

import java.util.List;

@Data
public class Project {
    private static final long serialVersionUID = 1L;
    private Integer projectId;
    private String projectName;
    private List<Env> envs;
    private List<TestData> testData;
}
