package com.kunlun.baize.service;

import com.kunlun.baize.sdk.UserQuery;
import com.kunlun.baize.sdk.page.Page;
import com.kunlun.baize.sdk.vo.UserVO;

import java.util.List;

/**
 * @Author 18555
 * @Date 2019/11/1 21:02
 * @Since 1.0.0
 */
public interface UserBO {

    /**
     * 分页条件查询用户信息
     * @param userQuery 用户条件查询对象
     * @param page 分页对象
     * @return 用户集合
     */
    List<UserVO> pageUser(UserQuery userQuery, Page page);
}
