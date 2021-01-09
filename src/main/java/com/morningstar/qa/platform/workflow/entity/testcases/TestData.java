package com.morningstar.qa.platform.workflow.entity.testcases;

import com.morningstar.qa.platform.common.BaseEntity;
import lombok.Data;

import java.util.List;

@Data
public class TestData extends BaseEntity {
    private int projectId;
    private int id;
    private String name;
    private String value;
    private String env;
}
