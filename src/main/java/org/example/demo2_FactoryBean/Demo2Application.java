package org.example.demo2_FactoryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo2Application
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo2Config.class);

        Course course = applicationContext.getBean("courseFactoryBean", Course.class);
        CourseService courseService = applicationContext.getBean(CourseService.class);

        System.out.println(course == courseService.getCourse());
    }
}
