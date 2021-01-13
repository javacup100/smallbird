package com.smallbird.backend.platform.workflow.entity.testcases;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * testcaserun
 * @author
 */
@Data
public class TestCaseRun implements Serializable {
    private Integer id;

    private Integer caseid;

    private String taskid;

    private String status;

    private String responsedata;

    private String extractfields;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
