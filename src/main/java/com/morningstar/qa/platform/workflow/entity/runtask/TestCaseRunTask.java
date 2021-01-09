package com.morningstar.qa.platform.workflow.entity.runtask;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * testcaseruntask
 * @author 
 */
@Data
public class TestCaseRunTask implements Serializable {
    private Integer id;

    private String caselist;

    private String status;

    private String createBy;

    private Date startTime;

    private Date endTime;

    private static final long serialVersionUID = 1L;
}