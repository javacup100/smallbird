package com.morningstar.qa.platform.workflow.entity.testcases;

import lombok.Data;

import java.util.List;

@Data
public class TestRun {
    private String taskId;
    private List<Integer> cases;
}
