package org.example.new_feature4_unittest;

import org.example.new_feature2_nullable.Book6;
import org.example.new_feature2_nullable.Demo6Config;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)

//相当与这句AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo6Config.class);
@ContextConfiguration(classes = { Demo6Config.class })
public class JTest5
{
    @Autowired
    private Book6 book6;

    @Test
    public void testGetBook6()
    {
        book6.displayVar("AAA");
    }
}
