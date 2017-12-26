package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class GirlAspect {
    private final static Logger logger= LoggerFactory.getLogger(GirlAspect.class);

    @Pointcut("execution(public * com.example.demo.controller.GirlController.*(..))")
    public void log() {
    }

    @Pointcut("execution(public * com.example.demo.controller.GirlController.*(..))")
    public void logNew() {
    }


    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("log-girl-before:11111");
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        StringBuffer requestURL = request.getRequestURL();
        logger.info("url:{}",requestURL);
        String method = request.getMethod();
        logger.info("method:{}",method);
        String remoteAddr = request.getRemoteAddr();
        logger.info("address:{}",remoteAddr);
        String className=joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName();
        logger.info("className:{}",className);
    }

    @After("log()")
    public void doAfter(){
        logger.info("log-girl-after:11111");
    }

    @Before("logNew()")
    public void doBeforeNew(){
        logger.info("logNew-girl-before:11111");
    }

    @After("logNew()")
    public void doAfterNew(){
        logger.info("logNew-girl-after:11111");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info(object.toString());
    }
}
