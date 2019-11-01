package com.kunlun.baize.web.controller;

import com.kunlun.baize.sdk.UserQuery;
import com.kunlun.baize.sdk.page.Page;
import com.kunlun.baize.sdk.vo.UserVO;
import com.kunlun.baize.service.UserBO;
import com.kunlun.baize.web.model.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 18555
 * @Date 2019/11/1 21:40
 * @Since 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserBO userBo;

    @ResponseBody
    @RequestMapping("/list/{currentPage}/{size}")
    public PageResult<List<UserVO>> list(@PathVariable("currentPage") Integer currentPage, @PathVariable("size") Integer size) {
        Page page = new Page(currentPage, size);
        List<UserVO> userVoList = userBo.pageUser(new UserQuery(), page);
        return new PageResult<>(currentPage, size, userVoList.size(), userVoList);
    }
}
