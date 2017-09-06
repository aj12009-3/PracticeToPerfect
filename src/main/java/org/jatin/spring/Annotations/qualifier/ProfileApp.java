package org.jatin.spring.Annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProfileApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationQualifier.xml");
        Profile profile = (Profile) context.getBean("profile");
        System.out.println(profile.getAge());
        System.out.println(profile.getName());
    }

}
