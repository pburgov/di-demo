package com.pburgov.didemo.config;

import com.pburgov.didemo.examplebeans.FooDataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${pbv.user}")
    String user;

    @Value("${pbv.password}")
    String password;

    @Value("${pbv.url}")
    String url;


    public FooDataSource fooDataSource(){
        FooDataSource fooDataSource = new FooDataSource();
        fooDataSource.setUser(user);
        fooDataSource.setPassword(password);
        fooDataSource.setUrl(url);
        return fooDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
