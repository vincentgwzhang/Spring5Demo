package org.example.demo4_AOP.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class NotVeryUsefulAspect {

    /**
     * execution(public * *(..))
     * execution(* set*(..))
     * execution(* com.xyz.service.AccountService.*(..))
     * execution(* com.xyz.service.*.*(..))//The execution of any method defined in the service package
     * execution(* com.xyz.service..*.*(..))//The execution of any method defined in the service package or one of its sub-packages:
     *
     */
    @Pointcut("execution(* org.example.demo4_AOP.common.*.*(..))")
    private void executionPointcut() {}

    @Pointcut("within(org.example.demo4_AOP.common..*)")
    private void withinPointcut() {}

    @Pointcut("executionPointcut() && withinPointcut()")
    private void signaturePointcut() {}

    @Pointcut("this(org.example.demo4_AOP.common.AccountService)")
    private void thisPointcut() {}

    @Pointcut("target(org.example.demo4_AOP.common.AccountService)")
    private void targetPointcut() {}

    /**
     * 直接使用 Pointcut 的 signature
     */
    @Pointcut("org.example.demo4_AOP.common.NotVeryUsefulAspect.targetPointcut() && args(account,..)")
    private void accountDataAccessOperation(Account account) {}

    @Before("org.example.demo4_AOP.common.NotVeryUsefulAspect.executionPointcut()")//直接使用签名
    public void doAccessCheck() {
        // ...
    }

    @Before("within(org.example.demo4_AOP.common..*)")//不需要pointcut
    public void doAccessCheck2() {
        // ...
    }

    @Before("@annotation(auditable)")
    public void audit(Auditable auditable) {
    }

    @Before("execution(* ..Sample+.sampleGenericMethod(*)) && args(param)")
    public void beforeSampleMethod(Account param) {
        // Advice implementation
    }
}
