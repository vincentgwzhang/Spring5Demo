package org.example.new_feature2_nullable;

import org.example.new_feature1_log.Book;
import org.example.new_feature1_log.Demo5Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo6Application
{
    private static final Logger logger = LoggerFactory.getLogger(Demo6Application.class);

    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo5Config.class);

        Book6 book = applicationContext.getBean(Book6.class);

        logger.info(book.toString());
    }
}
