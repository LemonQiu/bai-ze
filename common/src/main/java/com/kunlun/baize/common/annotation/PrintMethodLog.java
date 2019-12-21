package com.kunlun.baize.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author 18555
 * @Date 2019/12/21 14:35
 * @Since 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintMethodLog {

    boolean enable() default true;

    boolean printReturn() default true;
}
