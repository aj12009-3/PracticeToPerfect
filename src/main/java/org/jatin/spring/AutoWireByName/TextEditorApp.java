package org.jatin.spring.AutoWireByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditorApp {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("TextEditorBean.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("TextEditorAutowireByName.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
