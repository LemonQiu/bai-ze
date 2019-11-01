package com.kunlun.baize.dao.impl;

import com.kunlun.baize.dao.UserDAO;
import com.kunlun.baize.mapper.UserMapper;
import com.kunlun.baize.sdk.UserQuery;
import com.kunlun.baize.sdk.model.UserDO;
import com.kunlun.baize.sdk.page.Page;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 18555
 * @Date 2019/11/1 21:17
 * @Since 1.0.0
 */
@Repository
public class UserDaoImpl implements UserDAO {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserDO> pageUser(UserQuery userQuery, Page page) {
        return userMapper.pageUser(userQuery, page);
    }
}
