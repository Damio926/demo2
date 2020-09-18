package com.lazy.ssm.aspect;




import com.lazy.ssm.pojo.SysLog;
import com.lazy.ssm.service.ISysService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 监控业务层方法切面
 */
//@Aspect
//@Component
public class ServiceAspect {

    @Autowired
    private ISysService iSysService;
    /**
     * 当业务层方法执行成功后添加一条成功日志
     */
//    @AfterReturning(pointcut = "execution( * com.lazy.sm.service.*.*(..)) && ! execution( * com.lazy.sm.service.impl.ISysServiceImpl.*(..))")
    public void afterReturn(JoinPoint jp){
        //获取方法名
        String methodName =  jp.getSignature().getName();
        //获取类名
        String ClassName = jp.getTarget().getClass().getName();
        SysLog log = new SysLog();
        log.setMethodName(methodName);
        log.setClassName(ClassName);
        log.setLogType(1);
        log.setCallTime(new Date());
        //添加日志信息
        int flag = iSysService.insertSysLog(log);
        System.out.println(flag);
    }
    /**
     * 当业务层方法执行时发生异常，添加一条异常的日志信息
     */
//   @AfterThrowing(pointcut = "execution( * com.lazy.sm.service.*.*(..)) && ! execution( * com.lazy.sm.service.impl.ISysServiceImpl.*(..))",throwing = "e")
    public void afterThrows(JoinPoint jp,Throwable e ){
        //获取方法名
        String methodName =  jp.getSignature().getName();
        //获取类名
        String ClassName = jp.getTarget().getClass().getName();
        //异常类型名称
        String exeptionName = e.getClass().getName();
        //异常的信息
        String message = e.getMessage();
        message = message==null?"无":message;
        SysLog log = new SysLog();
        log.setMethodName(methodName);
        log.setClassName(ClassName);
        log.setLogType(2);
        log.setCallTime(new Date());
        log.setExceptionName(exeptionName);
        log.setMessage(message);
        iSysService.insertSysLog(log);
    }
//    @Before("execution( * com.lazy.sm.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        String metodName = joinPoint.getSignature().getName();
        System.out.println("方法:"+metodName+"即将被调用");
    }
    /**
     * 包围
     * @param point
     */
//    @Around("execution( * com.lazy.sm.service.*.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        String methodName = point.getSignature().getName();
        System.out.println(methodName+"调用前");
        //调用目标对象方法（即业务层方法）
        Object result = point.proceed();
        System.out.println(methodName+"调用后");
        return 10000;
    }
}
