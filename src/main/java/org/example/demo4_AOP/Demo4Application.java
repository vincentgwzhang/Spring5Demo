package org.example.demo4_AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Demo4Application
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo4Config.class);

        //User user = applicationContext.getBean(User.class);

        /**
         * 假设 User 设置为 final, 但是 User 有个 IUer 接口就必须如何建立
         * 但是如果 user 设置为 final, 那么 CGLIB 无论如何都无法建立
         */
        IUser user = applicationContext.getBean(IUser.class);

        user.add();

        System.out.println(user);
    }
}
