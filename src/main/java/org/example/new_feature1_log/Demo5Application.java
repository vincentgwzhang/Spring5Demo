package org.example.new_feature1_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo5Application
{
    private static final Logger logger = LoggerFactory.getLogger(Demo5Application.class);

    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo5Config.class);

        Book book = applicationContext.getBean(Book.class);

        logger.info(book.toString());
    }
}
