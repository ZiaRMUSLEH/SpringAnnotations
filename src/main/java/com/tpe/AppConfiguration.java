package com.tpe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Properties;
import java.util.Random;

@Configuration
@ComponentScan("com.tpe")      // Default: com.tpe
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    /*

            @Component:     Class Level
            @Bean:          Method Level

     */

    @Autowired
    private Environment environment;

    @Bean
    public Random random(){
        return new Random();
    }

    @Bean
    public Properties properties(){
        Properties properties = new Properties();
        properties.put("email", environment.getProperty("app.email"));
        return properties;

        // key : value
        // key : value
    }

}