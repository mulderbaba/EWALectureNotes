package tr.edu.hacettepe.bbm490.aspect;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * User: mertcaliskan
 * Date: 25/06/14
 */
public class ExecutionTimeLoggingSpringAOP implements MethodBeforeAdvice, AfterReturningAdvice {

    long startTime = 0;

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        startTime = System.nanoTime();
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        long elapsedTime = System.nanoTime() - startTime;
        String className = target.getClass().getCanonicalName();
        String methodName = method.getName();
        System.out.println("Execution of " + className + "#" + methodName + " ended in " + new BigDecimal(elapsedTime).divide(new BigDecimal(1000000)) + " milliseconds");
    }
}
