package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.service.PaymentService;
import com.springaop.serviceimpl.PaymentServiceImpl;

/**
 * Spring AOP Example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/config.xml");
        
        PaymentService paymentService = context.getBean("paymentServiceImpl", PaymentService.class);
        
        paymentService.makePayment();
        
        paymentService.getBalance(43567976567l);
        
    }
}
