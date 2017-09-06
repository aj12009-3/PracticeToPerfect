package org.jatin.spring.Annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
    private String name;

    public String getName() {
        return name;
    }
    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Autowired(required = false)
    public void setAge(int age) {
        this.age = age;
    }

    private int age;
}
