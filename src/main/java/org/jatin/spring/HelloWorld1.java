package org.jatin.spring;

public class HelloWorld1 {
    private String message1;
    private String message2;

    public String getMessage2() {
        return message2;
    }
    public void setMessage2(String message2) {
        this.message2 = message2;
    }
    public String getMessage1() {
        return message1;
    }
    public void setMessage1(String msg){
        this.message1 = msg;
    }

    public void init(){
        System.out.println("Init method of bean HelloWorld");
    }
    public void destroy(){
        System.out.println("destroy method of bean HelloWorld");
    }
}
