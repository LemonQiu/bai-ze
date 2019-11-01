package com.kunlun.baize.sdk.vo;

import lombok.Data;

import java.util.Date;

/**
 * @Author 18555
 * @Date 2019/11/1 19:13
 * @Since 1.0.0
 */
@Data
public class UserVO {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 是否删除
     */
    private String isDeleted;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户年龄
     */
    private Integer userAge;
}
