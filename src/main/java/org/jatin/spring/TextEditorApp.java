package org.jatin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditorApp {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("TextEditorBean.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("TextEditorInnerBean.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
