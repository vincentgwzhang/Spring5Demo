package org.example.new_feature3_lambda;

import java.text.DateFormat;
import java.util.Date;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Book7
{
    public Book7(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    private String str1;

    private String str2;
}
