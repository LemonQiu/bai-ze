package com.kunlun.baize.mapper;

import com.kunlun.baize.sdk.UserQuery;
import com.kunlun.baize.sdk.model.UserDO;
import com.kunlun.baize.sdk.page.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户mapper
 * @Author 18555
 * @Date 2019/11/1 19:09
 * @Since 1.0.0
 */
@Mapper
public interface UserMapper {

    /**
     * 分页条件查询用户信息
     * @param userQuery 用户数据查询对象
     * @param page 分页对象
     * @return 用户集合
     */
    List<UserDO> pageUser(@Param("userQuery") UserQuery userQuery, @Param("page") Page page);

    /**
     * 根据ID查询用户信息
     * @param id 用户ID
     * @return 用户数据模型
     */
    UserDO get(@Param("id") Long id);

    /**
     * 保存用户信息
     * @param userDO 用户数据模型
     * @return int
     */
    int save(@Param("userDO") UserDO userDO);

    /**
     * 修改用户信息
     * @param userDO 用户数据模型
     * @return int
     */
    int update(@Param("userDO") UserDO userDO);

    /**
     * 删除用户信息
     * @param id 用户ID
     * @return int
     */
    int delete(@Param("id") Long id);

    /**
     * 批量删除用户数据
     * @param idList 用户ID集合
     * @return int
     */
    int batchDelete(@Param("idList") List<Long> idList);
}
