package org.example.demo1;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class ClassB
{
    public ClassB()
    {
        bString = new Date().toString();
    }

    private String bString;

    public String getbString()
    {
        return bString;
    }

    public void setbString(String bString)
    {
        this.bString = bString;
    }
}
