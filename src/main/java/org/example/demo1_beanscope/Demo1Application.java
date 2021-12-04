package org.example.demo1_beanscope;

import java.util.concurrent.TimeUnit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1Application
{
    public static void main(String... args) throws InterruptedException
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo1Config.class);

        ClassA classA1 = applicationContext.getBean(ClassA.class);
        System.out.println(classA1.getClassB().getBString());
        TimeUnit.SECONDS.sleep(1);

        ClassA classA2 = applicationContext.getBean(ClassA.class);
        System.out.println(classA2.getClassB().getBString());

        System.out.println(classA1 == classA2);
        System.out.println(classA1.getClassB() == classA2.getClassB());
        applicationContext.close();
    }
}
