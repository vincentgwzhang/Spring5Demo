package org.example.demo4_AOP.special_DeclareParents;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
    //"+"表示person的所有子类；defaultImpl 表示默认需要添加的新的类
    @DeclareParents(value = "org.example.demo4_AOP.special_DeclareParents.Person+", defaultImpl = FemaleAnimal.class)
    public Animal animal;
}