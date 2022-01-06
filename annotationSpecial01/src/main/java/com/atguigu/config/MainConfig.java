package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类
@ComponentScan(value = "com.atguigu")
public class MainConfig {
    //给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
    @Bean("person_zhujie")
    public Person person01(){
        return new Person("李梦莎", 20);
    }
}
