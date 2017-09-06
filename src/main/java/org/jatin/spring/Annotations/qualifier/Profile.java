package org.jatin.spring.Annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
    public Student getStudent() {
        return student;
    }

    public int getAge(){
        return student.getAge();
    }
    public String getName(){
        return student.getName();
    }
    @Autowired
    @Qualifier("student1")
    private Student student;

}
