package org.example.new_feature1_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Book
{
    private static final Logger logger = LoggerFactory.getLogger(Book.class);

    private String str1;

    private String str2;
}
