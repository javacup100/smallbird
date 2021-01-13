package com.smallbird.backend.platform.workflow.entity.project;

import lombok.Data;

@Data
public class API {
    private String path;
    private String method;
    private String Accept;
    private String ContentType;
}
