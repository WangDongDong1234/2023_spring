package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.filter.MyTypeFilter;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类
@ComponentScans(value = {
        @ComponentScan(value = "com.atguigu",includeFilters ={
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        },useDefaultFilters = false)
})
public class MainConfig {
    //给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
    @Bean("person_zhujie")
    public Person person01(){
        return new Person("李梦莎", 20);
    }
}
