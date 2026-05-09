package com.whm.whmaicodebackend.model.dto;

import lombok.Data;

@Data
public class UserLoginRequest {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}
