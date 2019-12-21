package com.kunlun.baize.common.aspect;

import com.alibaba.fastjson.JSON;
import com.kunlun.baize.common.annotation.PrintMethodLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author 18555
 * @Date 2019/12/21 14:42
 * @Since 1.0.0
 */
@Aspect
@Component
public class PrintMethodLogAspect {

    @Pointcut("@annotation(com.kunlun.baize.common.annotation.PrintMethodLog)")
    private void printMethodLogPointCut(){}

    private static final Logger LOGGER = LoggerFactory.getLogger(PrintMethodLogAspect.class);

    @Around("printMethodLogPointCut() && @annotation(printMethodLog)")
    private Object printMethodLog(ProceedingJoinPoint point, PrintMethodLog printMethodLog) {
        try {
            long startTime = System.currentTimeMillis();
            // 获取方法参数
            Object[] args = point.getArgs();
            if(!printMethodLog.enable()) {
                return point.proceed(args);
            }
            // 获取方法
            MethodSignature signature = (MethodSignature) point.getSignature();
            Method method = signature.getMethod();
            // 打印参数
            printParam(args, method.getName());
            // 打印返回值
            if(printMethodLog.printReturn()) {
                Object proceed = point.proceed(args);
                LOGGER.info("方法{}返回值为{}", method.getName(), JSON.toJSONString(proceed));
            }
            long endTime = System.currentTimeMillis();
            LOGGER.info("方法{}执行时间: {}", method.getName(), endTime - startTime);
            return point.proceed(args);
        } catch (Throwable e) {
            LOGGER.info("方法执行异常，异常原因: {}", e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    /**
     * 打印参数
     * @param args 参数数组
     * @param methodName 方法名称
     */
    private void printParam(Object[] args, String methodName) {
        if(args.length == 0) {
            LOGGER.info("执行方法{}没有参数", methodName);
            return;
        }

        StringBuilder builder  = new StringBuilder();
        builder.append("方法").append(methodName);
        for(int i = 0; i < args.length; i++) {
            Object arg = args[i];
            builder.append("第")
                        .append(i + 1)
                        .append("个参数: ")
                        .append(JSON.toJSONString(arg))
                        .append("\n");
        }
        LOGGER.info(builder.toString());
    }
}
