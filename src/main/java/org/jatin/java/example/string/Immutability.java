package org.jatin.java.example.string;

public class Immutability {
  public static void main(String[] args) {
    String s1 = new String("Jatin");
    String s2 = new String("Jatin");
    String s5 = s1.intern();
    String s3 = "Jatin";
    String s4 = "Jatin";

    System.out.println(s1 == s2);
    System.out.println(s5 == s3);
    System.out.println(s3 == s4);

  }
}
