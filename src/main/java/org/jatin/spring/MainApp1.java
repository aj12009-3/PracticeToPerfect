package org.jatin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");

        HelloWorld1 objA = (HelloWorld1) context.getBean("helloWorld");
        System.out.println(objA.getMessage1());
        System.out.println(objA.getMessage2());

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
