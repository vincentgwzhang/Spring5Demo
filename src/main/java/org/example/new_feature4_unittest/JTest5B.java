package org.example.new_feature4_unittest;

import org.example.new_feature2_nullable.Book6;
import org.example.new_feature2_nullable.Demo6Config;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @ExtendWith(SpringExtension.class)
 *
 * //相当与这句AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo6Config.class);
 * @ContextConfiguration(classes = { Demo6Config.class })
 */
@SpringJUnitConfig(classes = { Demo6Config.class })//代替两个Annotation
public class JTest5B
{
    @Autowired
    private Book6 book6;

    @Test
    public void testGetBook6()
    {
        book6.displayVar("AAA");
    }
}
