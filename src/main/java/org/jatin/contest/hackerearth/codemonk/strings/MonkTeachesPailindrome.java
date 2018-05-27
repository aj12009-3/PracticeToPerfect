package org.jatin.contest.hackerearth.codemonk.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkTeachesPailindrome {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(reader.readLine());
    while (T-- != 0){
      String string = reader.readLine();
      isPailindrome(string);
    }
  }
  static void isPailindrome(String string){
    int i = 0;
    int j = string.length()-1;
    while (i < j) {
      if (string.charAt(i) != string.charAt(j)){
        System.out.println("NO");
        return;
      }
      i++; j--;
    }
    System.out.println("YES " + evenOrOdd(string.length()));
  }
  static String evenOrOdd(int length){
    if (length % 2 == 0){
      return "EVEN";
    }
    else
      return "ODD";
  }
}
