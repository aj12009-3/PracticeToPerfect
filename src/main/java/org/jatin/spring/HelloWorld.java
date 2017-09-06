package org.jatin.spring;

public class HelloWorld {
    private String message;

    public String getMessage() {
        return message;
    }
    public void setMessage(String msg){
        this.message = msg;
    }
    public void init(){
        System.out.println("Init method of bean HelloWorld");
    }
    public void destroy(){
        System.out.println("destroy method of bean HelloWorld");
    }
}
