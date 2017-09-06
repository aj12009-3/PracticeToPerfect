package org.jatin.spring.Annotations.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditorApp {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("TextEditorBean.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationAutowired.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
