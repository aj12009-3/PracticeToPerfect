package org.jatin.contest.hackerearth.codemonk.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelPhobia {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(reader.readLine());
    String string;
    int count;
    while (T-- != 0) {
      count = 0;
      string = reader.readLine();
      for (int i = 0; i < string.length(); i++) {
        char c = string.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
