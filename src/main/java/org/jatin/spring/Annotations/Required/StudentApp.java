package org.jatin.spring.Annotations.Required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationRequired.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getAge());
        System.out.println(student.getName());
    }

}
