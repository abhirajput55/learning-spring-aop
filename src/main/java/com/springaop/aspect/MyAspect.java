package com.springaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
//	Always execute before method
	@Before("execution(void com.springaop.serviceimpl.PaymentServiceImpl.makePayment())")
	public void beforeMakePayment() {
		
		System.out.println("Aspect Before makePayment");
	}
	
//	Always execute after method irrespective of exception like finally
	@After("execution(void com.springaop.serviceimpl.PaymentServiceImpl.makePayment())")
	public void afterMakePayment() {
		
		System.out.println("Aspect After makePayment");
	}
	
//	Always execute after method if and only if no exception occurred
	@AfterReturning("execution(void com.springaop.serviceimpl.PaymentServiceImpl.getBalance(..))")  // (..) for argument type
	public void afterSuccessGetBalance() {
		
		System.out.println("Aspect After Return Success getBalance");
	}
	
//	Always execute after method if and only if exception occurred
	@AfterThrowing("execution(void com.springaop.serviceimpl.PaymentServiceImpl.getBalance(..))")  // (..) for argument type
	public void afterExceptionGetBalance() {
		
		System.out.println("Aspect After Return Exception getBalance");
	}
	
	
	
//	Sure! Here are the key points about Spring AOP (Aspect-Oriented Programming):
//
//	1. What is AOP?
//	   - AOP is a programming paradigm that aims to increase modularity by separating cross-cutting concerns 
//		 (like logging, security, transaction management) from business logic.
//
//	2. Core Concepts in AOP:
//	   - Aspect: A modularization/class of a cross-cutting concern (e.g., logging, security).
//	   - Join Point: A point in the program execution where an aspect can be applied (e.g., method execution).
//	   - Advice: The code that is executed at a particular join point (e.g., before, after, or around a method call).
//	   - Pointcut: A predicate that matches join points (e.g., a method in a specific class).
//	   - Weaving: The process of applying aspects to the target code, either at compile-time, load-time, or runtime.
//
//	3. Types of Advice:
//	   - Before Advice: Runs before the method execution.
//	   - After Advice: Runs after the method execution (whether the method succeeds or fails).
//	   - After Returning Advice: Runs after the method successfully returns.
//	   - After Throwing Advice: Runs after the method throws an exception.
//	   - Around Advice: Surrounds the method execution, allowing you to control whether the method is executed or not.
//
//	4. Pointcut Expressions:
//	   - Pointcuts define where advice should be applied. Examples:
//	     - `execution(* com.example.service.*(..))` applies to all methods in the service package.
//	     - `@annotation(com.example.Loggable)` applies to methods annotated with `@Loggable`.
//
//	5. Spring AOP vs AspectJ:
//	   - Spring AOP is a proxy-based AOP implementation, supporting method interception but limited to only method-level advice.
//	   - AspectJ is a more powerful AOP framework that supports field, constructor, and other join points beyond method execution.
//
//	6. Proxy-Based AOP:
//	   - In Spring, AOP is implemented via dynamic proxies (JDK proxies or CGLIB proxies), 
//	     which are automatically created around beans to apply the aspect logic.
//
//	7. Declaring an Aspect:
//	   - Use `@Aspect` annotation to declare an aspect.
//	   - Use `@Before`, `@After`, `@Around`, etc., to define the advice.
//
//	8. Order of Advice:
//	   - The order of advice execution can be controlled using `@Order` annotation (lower values are higher priority).
//
//	9. AOP in Spring Configuration:
//	   - Spring AOP is enabled by adding `@EnableAspectJAutoProxy` in the configuration class.
//	   - Example: `@EnableAspectJAutoProxy(proxyTargetClass = false)` to enable proxy-based AOP.
//
//	10. Advantages of AOP:
//	    - Separation of Concerns: Keeps cross-cutting concerns separate from business logic.
//	    - Reusability: Aspects can be reused across different parts of the application.
//	    - Decoupling: Reduces tight coupling between different parts of the application.
//
//	11. Limitations:
//	    - Spring AOP only supports method-level advice.
//	    - More complex AOP features, like field or constructor advice, are better supported in AspectJ.
		    
}
