package com.kodilla.kodillapatterns2_2.facade.api;

import com.kodilla.kodillapatterns2_2.facade.Order;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderFacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacadeWatcher.class);

    @Before("execution(* com.kodilla.kodillapatterns2_2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId)")
    public void logEvent(OrderDto order, Long userId) {
        LOGGER.info("Processing order for user with ID: " + userId);
    }

    @After("execution(* com.kodilla.kodillapatterns2_2.facade.api.OrderFacade.processOrder(..))")
    public void logAfter() {
        LOGGER.info("Processing order finish");
    }

    @AfterReturning("execution(* com.kodilla.kodillapatterns2_2.facade.api.OrderFacade.processOrder(..))")
    public void logAfterReturning() {
        LOGGER.info("without errors.");
    }

    @AfterThrowing("execution(* com.kodilla.kodillapatterns2_2.facade.api.OrderFacade.processOrder(..))")
    public void logAfterThrowing() {
        LOGGER.info("with exception!");
    }

    @Around("execution(* com.kodilla.kodillapatterns2_2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed by this method: " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
