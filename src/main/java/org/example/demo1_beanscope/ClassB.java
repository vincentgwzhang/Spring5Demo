package org.example.demo1_beanscope;

import java.util.Date;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ClassB
{
    public ClassB()
    {
        bString = new Date().toString();
    }

    private String bString;
}
