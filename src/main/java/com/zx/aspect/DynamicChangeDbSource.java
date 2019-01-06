package com.zx.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.zx.myenum.DataSources;
import org.zx.tools.connection.DataSourceTypeManager;


@Aspect // for aop
@Component // for auto scan
@Order(0) // execute before @Transactional
public class DynamicChangeDbSource {
    @Pointcut("execution(public * com.zx.service..*.*(..))")
    public void invanyMethod() {
    };

    @Pointcut("execution(public * com.zx.service..*.*(..))")
    public void galaxyanyMethod() {
    };

    @Before("invanyMethod()")
    public void beforeinv(JoinPoint jp) {
        Object[] args = jp.getArgs();
        if(args==null){
            DataSourceTypeManager.set(DataSources.MASTER);
            //return;
        }
        //System.out.println("-------------" + args[0]);
        DataSourceTypeManager.set(DataSources.MASTER);
    }

    @Before("galaxyanyMethod()")
    public void beforegalaxy(JoinPoint jp) {
        DataSourceTypeManager.set(DataSources.SLAVE);
    }

}
