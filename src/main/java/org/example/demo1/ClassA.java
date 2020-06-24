package org.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA
{
    @Autowired
    private ClassB classB;

    public ClassB getClassB()
    {
        return classB;
    }

    public void setClassB(ClassB classB)
    {
        this.classB = classB;
    }
}
