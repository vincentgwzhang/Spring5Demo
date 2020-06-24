package org.example.new_feature2_nullable;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Book6
{
    private String str1;

    private String str2;

    @Nullable
    private Integer getAIntegerValue() {
        return null;
    }

    public void displayVar(@Nullable String var) {
        System.out.println(var);
    }
}
