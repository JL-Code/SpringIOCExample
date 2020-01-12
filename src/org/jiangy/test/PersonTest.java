package org.jiangy.test;

import org.jiangy.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class PersonTest {


    @Test
    public void testMethod() {

        // ApplicationContext 表示 IOC 容器
        // 1. 通过 classPath 创建 容器上下文。
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

        Person person = (Person) context.getBean("Person");

        Assert.notNull(person);

        System.out.println(person);
    }
}