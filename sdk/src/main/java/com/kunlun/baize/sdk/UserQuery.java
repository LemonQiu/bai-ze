package com.kunlun.baize.sdk;

import lombok.Data;

import java.util.Date;

/**
 * @Author 18555
 * @Date 2019/11/1 20:24
 * @Since 1.0.0
 */
@Data
public class UserQuery {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 用户昵称
     */
    private String nickName;

}
