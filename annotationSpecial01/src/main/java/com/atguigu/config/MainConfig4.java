package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

//默认所有的bean都是单实例的
@Configuration
public class MainConfig4 {

    @Lazy
    @Bean("person")
    public Person person01(){
        System.out.println("add bean");
        return new Person("李梦莎", 20);
    }
}
