package com.example.demo.tool;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author : rain
 * @date : 2018/8/9 6:38 AM
 * 时间记录切面，收集接口的运行时间
 */
@Aspect
@Component
public class TimerAspect {
    // 修正Timer注解的全局唯一限定符
    @Pointcut("@annotation(com.example.demo.tool.Timer)")
    private void pointcut() {}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        // 获取目标Logger
        Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());

        // 获取目标类名称
        String clazzName = joinPoint.getTarget().getClass().getName();

        // 获取目标类方法名称
        String methodName = joinPoint.getSignature().getName();

        long start = System.currentTimeMillis();
        logger.info( "{}: {}: start...", clazzName, methodName);

        // 调用目标方法
        Object result = joinPoint.proceed();

        long time = System.currentTimeMillis() - start;
        logger.info( "{}: {}: : end... cost time: {} ms", clazzName, methodName, time);

        return result;
    }
}

