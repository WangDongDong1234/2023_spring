package com.atguigu.lianxi;


import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfig2;
import com.atguigu.config.MainConfig3;
import com.atguigu.config.MainConfig4;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice1 {

    @Test
    public void test_1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person bean = (Person) applicationContext.getBean("person88");
		System.out.println(bean);

        // 根据类型获得bean在容器中的名字
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : namesForType) {
            System.out.println(name);
        }
    }

    @Test
    public void test_2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        // 根据类型获得bean在容器中的名字
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : namesForType) {
            System.out.println(name);
        }
    }

    @Test
    public void test_3(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }

    /**
     * 容器中bean单实例验证
     */
    @Test
    public void test_4(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        Object person1 = applicationContext.getBean("person");
        Object person2 = applicationContext.getBean("person");
        System.out.println(person1==person2);
    }

    /**
     * 容器中bean多实例验证
     */
    @Test
    public void test_5(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig3.class);
        Object person1 = applicationContext.getBean("person");
        Object person2 = applicationContext.getBean("person");
        System.out.println(person1==person2);
    }

    /**
     * 单实例bena懒加载
     */
    @Test
    public void test_6(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig4.class);
        System.out.println("IOC-ok");
    }



}
