package com.kunlun.baize.service.impl;

import com.kunlun.baize.common.annotation.PrintMethodLog;
import com.kunlun.baize.common.utils.BeanConvertUtil;
import com.kunlun.baize.dao.UserDAO;
import com.kunlun.baize.sdk.UserQuery;
import com.kunlun.baize.sdk.model.UserDO;
import com.kunlun.baize.sdk.page.Page;
import com.kunlun.baize.sdk.vo.UserVO;
import com.kunlun.baize.service.UserBO;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @Author 18555
 * @Date 2019/11/1 21:02
 * @Since 1.0.0
 */
@Service
public class UserBoImpl implements UserBO {

    @Resource
    private UserDAO userDAO;

    @Override
    @PrintMethodLog
    public List<UserVO> pageUser(UserQuery userQuery, Page page) {
        List<UserDO> userDoList = userDAO.pageUser(userQuery, page);
        if (CollectionUtils.isEmpty(userDoList)) {
            return Collections.emptyList();
        }

        return BeanConvertUtil.copyList(userDoList, UserVO.class);
    }
}
