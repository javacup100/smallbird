package com.morningstar.qa.platform.workflow.entity.testcases;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * testcase
 * @author
 */
@Data
public class TestCase implements Serializable {
    private Integer id;

    private String priority;

    private Integer projectid;

    private String group;

    private String name;

    private String api;

    private String requestparam;

    private String requestdata;

    private String condition;

    private String extractfields;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;

    private static final long serialVersionUID = 1L;
}
