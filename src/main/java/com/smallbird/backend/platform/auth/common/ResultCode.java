package com.smallbird.backend.platform.auth.common;

public enum ResultCode {
    SUCCESS(200, "success"),
    FAIL(999, "fail"),
    PARAM_NOT_VALID(1001, "invalid "),
    PARAM_IS_BLANK(1002, "blank parameters"),
    USER_NOT_LOGIN(2001, "user not logged in"),
    USER_ACCOUNT_EXPIRED(2002, "account expired"),
    USER_PASSWORD_ERROR(2003, "password error"),
    USER_ACCOUNT_DISABLE(2005, "account disabled"),
    USER_ACCOUNT_LOCKED(2006, "account locked"),
    USER_ACCOUNT_NOT_EXIST(2007, "account not exist"),
    USER_ACCOUNT_ALREADY_EXIST(2008, "account already exists"),
    USER_ACCOUNT_USE_BY_OTHERS(2009, "account logged in by others"),
    NO_PERMISSION(3001, "no permission");
    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public static String getMessageByCode(Integer code) {
        for (ResultCode ele : values()) {
            if (ele.getCode().equals(code)) {
                return ele.getMessage();
            }
        }
        return null;
    }
}
