package org.example.demo4_AOP.special_DeclareParents;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Sample1SpecialApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Person person = (Person) ctx.getBean("women");
        Animal animal = (Animal)person; // 注意了，此处没有出现 ClassCastException
        animal.eat();
    }
}