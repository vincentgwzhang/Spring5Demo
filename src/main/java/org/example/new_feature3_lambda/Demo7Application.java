package org.example.new_feature3_lambda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericApplicationContext;

public class Demo7Application
{
    private static final Logger logger = LoggerFactory.getLogger(Demo7Application.class);

    public static void main(String[] args)
    {
        GenericApplicationContext context = new GenericApplicationContext();

        context.refresh();

        context.registerBean("THIS_BOOK", Book7.class, ()-> new Book7("aa1", "aa2"));

        Book7 book7 = context.getBean("THIS_BOOK", Book7.class);

        logger.info(book7.toString());
    }
}
