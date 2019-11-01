package com.kunlun.baize.common.utils;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @Author 18555
 * @Date 2019/11/1 21:22
 * @Since 1.0.0
 */
public class BeanConvertUtil {

    /**
     * 将源对象转换为目标对象
     * @param source 源对象
     * @param clazz 目标class对象
     * @param <T> 源
     * @param <E> 目标
     * @return 目标
     */
    public static<T, E> E copyBean(T source, Class<E> clazz) {
        String s = JSON.toJSONString(source);
        return JSON.parseObject(s, clazz);
    }

    /**
     * 将源集合转换为目标集合
     * @param sourceList 源集合
     * @param clazz 目标class对象
     * @param <T> 源
     * @param <E> 目标
     * @return 目标集合
     */
    public static<T, E> List<E> copyList(List<T> sourceList, Class<E> clazz) {
        String s = JSON.toJSONString(sourceList);
        return JSON.parseArray(s, clazz);
    }

}
