package org.spring.boot.aspect;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class HttpAspect {
	
	@Pointcut("execution(public * org.spring.boot.controller.ExampleController.*(..))")
	public void log() {
		System.out.println("--------------------");
	}
	
	@Before("log()")
	public void doBefore(JoinPoint joinPoint) {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		System.out.println("url = " + request.getRequestURL().toString());
		System.out.println("ip = " + request.getRemoteAddr());
		System.out.println("method = " + request.getMethod());
		System.out.println("class_method = " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
		System.out.println("args = " + Arrays.toString(joinPoint.getArgs()));
	}
	
	@After("log()")
	public void doAfter() {
		System.out.println("---------2---------");
	}
	@AfterReturning(pointcut = "log()", returning = "obj")
	public void AfterReturn(Object obj) {
		System.out.println(obj.toString());
	}
	
	
}
