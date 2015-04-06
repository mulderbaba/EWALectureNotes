package tr.edu.hacettepe.bbm490.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.math.BigDecimal;

/**
 * User: mertcaliskan
 * Date: 25/06/14
 */
public class ExecutionTimeLoggingWithAroundAdvice {

    public void executiontimeLogging(ProceedingJoinPoint jp) throws Throwable {
        long startTime = System.nanoTime();
        String className = jp.getTarget().getClass().getCanonicalName();
        String methodName = jp.getSignature().getName();

        jp.proceed();

        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Execution of " + className + "#" + methodName + " ended in " + new BigDecimal(elapsedTime).divide(new BigDecimal(1000000)) + " milliseconds");
    }
}
