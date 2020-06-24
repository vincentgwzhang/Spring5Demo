package org.example.demo4_AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.demo4_AOP"})
@EnableAspectJAutoProxy(proxyTargetClass = true)//加了这一句，AOP才能实现
/**
 * proxy-target-class属性值决定是基于接口的还是基于类的代理被创建。
 * 如果proxy-target-class 属性值被设置为true，那么基于类的代理将起作用（这时需要cglib库）。
 * 如果proxy-target-class属值被设置为false或者这个属性被省略，那么标准的JDK 基于接口的代理将起作用
 */
public class Demo4Config
{
    /**
     *
     * proxy-target-class="true" 与proxy-target-class="false"的区别
     *
     * 1, 首先我有一个abstractService父类，
     * 2, 子类UserService继承这个父类，没有写UserService接口（IUserService）。
     *
     * 如果有如下的语句：
     * User u = ((UserService) SpringUtils.getBean("userService")).queryByUsername(model);
     *
     * 那么:
     * 报 $Proxy X cannot be cast to 。。。。的错。
     * 原因是：注解事务是AOP实现的，AOP是需要接口的
     *
     * 解决办法
     * 设置beanNameAutoProxyCreater的proxyTargetClass属性为true，意思是强制使用CGLIB代理，前提是你已经将CGLIB包加到项目中了。
     *
     *
     *
     * CGLib所创建的动态代理对象在实际运行时候的性能要比JDK动态代理高不少
     * 但是CGLib在创建对象的时候所花费的时间却比JDK动态代理要多很多，有研究表明，大概有8倍的差距；
     */

    /**
     *
     @Pointcut("within(tina.coffee.webmvc.*.*)")
     private void isMVCMethod() {}

     @Pointcut(
     "@annotation(org.springframework.web.bind.annotation.GetMapping) " +
     "|| @annotation(org.springframework.web.bind.annotation.PostMapping) " +
     "|| @annotation(org.springframework.web.bind.annotation.PutMapping) " +
     "|| @annotation(org.springframework.web.bind.annotation.DeleteMapping) " +
     "|| @annotation(org.springframework.web.bind.annotation.RequestMapping) " +
     "|| @annotation(org.springframework.web.bind.annotation.PatchMapping)")
     private void containMappingAnnotation() {}

     @Around("isMVCMethod() && containMappingAnnotation()")
     public Object registryMark(ProceedingJoinPoint joinPoint) throws Throwable{
     *
     *
     *
     *
     *
     *        @Pointcut(" execution(* course.service.*.*(..))")
     * 	private void anyPublicOperation() {}
     *
     *    @Before("anyPublicOperation()")
     *     public void doAccessCheck(JoinPoint jp) {
     * 		logger.debug(jp.getSignature().getName());//function name
     * 		logger.debug(jp.getThis().getClass().getName());//target class name
     *     }
     */
}
