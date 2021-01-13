package com.smallbird.backend.platform.auth.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * request_path
 * @author
 */
@Data
public class UserRole implements Serializable {
    private Integer id;

    private String url;

    private String description;

    private static final long serialVersionUID = 1L;
}
