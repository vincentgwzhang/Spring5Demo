package org.example.demo4_AOP.special_DeclareParents;

import org.springframework.stereotype.Component;

@Component
public class FemaleAnimal implements Animal {

    @Override
    public void eat() {
        System.out.println("我是雌性，我比雄性更喜欢吃零食");
    }
}