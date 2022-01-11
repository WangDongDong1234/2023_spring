package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.filter.MyTypeFilter;
import org.springframework.context.annotation.*;

//默认所有的bean都是单实例的
@Configuration
public class MainConfig2 {

    @Bean("person")
    public Person person01(){
        return new Person("李梦莎", 20);
    }
}
