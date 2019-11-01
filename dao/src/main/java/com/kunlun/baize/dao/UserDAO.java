package com.kunlun.baize.dao;

import com.kunlun.baize.sdk.UserQuery;
import com.kunlun.baize.sdk.model.UserDO;
import com.kunlun.baize.sdk.page.Page;

import java.util.List;

/**
 * @Author 18555
 * @Date 2019/11/1 19:10
 * @Since 1.0.0
 */
public interface UserDAO {
    /**
     * 分页条件查询用户信息
     * @param userQuery 用户条件查询对象
     * @param page 分页对象
     * @return 用户集合
     */
    List<UserDO> pageUser(UserQuery userQuery, Page page);
}
