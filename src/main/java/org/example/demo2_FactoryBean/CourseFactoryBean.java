package org.example.demo2_FactoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class CourseFactoryBean implements FactoryBean<Course>
{
    @Override
    public Course getObject() throws Exception
    {
        final Course course = new Course();
        course.setStr1("str1 value");
        course.setStr2("str2 value");
        return course;
    }

    @Override
    public Class<?> getObjectType()
    {
        return Course.class;
    }

    @Override
    public boolean isSingleton()
    {
        return true;
    }
}
