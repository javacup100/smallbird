package com.smallbird.backend.platform.workflow.entity.project;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Env {
    private String EnvName;
    private String endPoint;
    private Map<String,String> customParams;
    private List<API> apis;
}
