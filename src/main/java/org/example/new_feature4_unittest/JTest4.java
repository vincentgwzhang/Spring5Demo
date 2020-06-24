package org.example.new_feature4_unittest;

import org.example.new_feature2_nullable.Book6;
import org.example.new_feature2_nullable.Demo6Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

//相当与这句AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo5Config.class);
@ContextConfiguration(classes = { Demo6Config.class })
public class JTest4
{
    @Autowired
    private Book6 book6;

    @Test
    public void testGetBook6()
    {
        book6.displayVar("AAA");
    }
}
