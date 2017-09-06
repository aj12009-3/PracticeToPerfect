package org.jatin.spring.Annotations.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationAutowiredWithoutRequired.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getAge());
        System.out.println(student.getName());
    }

}
