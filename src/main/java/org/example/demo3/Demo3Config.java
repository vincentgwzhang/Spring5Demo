package org.example.demo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class Demo3Config
{
    /**
     * prop.driverClass=com.mysql.jdbc.Driver
     * prop.url=jdbc:mysql://localhost:3306/userDb
     * prop.userName=root
     * prop.password=root
     * @return
     */
    @Bean
    public DBInfo initialDBInfo(@Value("${prop.driverClass}") String driverClass, @Value("${prop.url}") String url, @Value("${prop.userName}") String userName, @Value("${prop.password}") String password)
    {
        return new DBInfo(driverClass, url, userName, password);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
