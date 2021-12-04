package org.example.demo4_AOP.special_DeclareParents;

import org.springframework.stereotype.Component;

@Component("women")
public class Women implements Person {

    @Override
    public void likePerson() {
        System.out.println("我是女生，我喜欢帅哥");
    }
}