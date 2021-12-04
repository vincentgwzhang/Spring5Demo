package org.example.demo1_beanscope;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class ClassA
{
    private ClassB classB;

    @Autowired
    public ClassA(ClassB classB) {
        this.classB = classB;
    }
}
