package org.example.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo2Application
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo2Config.class);

        Course course = applicationContext.getBean("mockCourse", Course.class);

        System.out.println(course.getStr1());
    }
}
