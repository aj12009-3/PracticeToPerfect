package org.jatin.contest.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pailindrome {
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String string = reader.readLine();
    int i = 0;
    int j = string.length()-1;
    while (i < j) {
      if (string.charAt(i) != string.charAt(j)){
        System.out.println("NO");
        return;
      }
      i++; j--;
    }
    System.out.println("YES");
  }
}
