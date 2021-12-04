package org.example.demo3_readProperty;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo3Application
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo3Config.class);
        DBInfo dbInfo = applicationContext.getBean(DBInfo.class);

        System.out.println(dbInfo.toString());
    }
}
