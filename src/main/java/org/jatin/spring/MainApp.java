package org.jatin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileReader;

public class MainApp {
    public static void main(String[] args) throws Exception{

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        //normal application
//        HelloWorld obj = (HelloWorld) applicationContext.getBean("helloWorld");
//        System.out.println(obj.getMessage());

         // Singleton Bean
//        HelloWorld objA = (HelloWorld) applicationContext.getBean("helloWorld1");
//        objA.setMessage("Object A");
//        System.out.println(objA.getMessage());
//        HelloWorld objB = (HelloWorld) applicationContext.getBean("helloWorld1");
//        System.out.println(objB.getMessage());

        // prototype bean
//        HelloWorld objA = (HelloWorld) applicationContext.getBean("helloWorld2");
//        objA.setMessage("Object A");
//        System.out.println(objA.getMessage());
//        HelloWorld objB = (HelloWorld) applicationContext.getBean("helloWorld2");
//        System.out.println(objB.getMessage());

        // Init and Destroy method usage
//        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj = (HelloWorld) applicationContext.getBean("helloWorld");
//        System.out.println(obj.getMessage());
//        //calls destroy method
//        applicationContext.registerShutdownHook();

        // BeanPostProcessor usage
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(obj.getMessage());
        //calls destroy method
        applicationContext.registerShutdownHook();

    }
}
