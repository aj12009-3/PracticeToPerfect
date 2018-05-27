package org.jatin.contest.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrams {
  static int arr1[] = new int[26];
  static int arr2[] = new int[26];
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(reader.readLine());
    String str1;
    String str2;
    int sum = 0;
    while (T-- != 0) {
      sum = 0;
      str1 = reader.readLine();
      str2 = reader.readLine();
      for (int i = 0; i < str1.length(); i++) {
        arr1[str1.charAt(i) - 'a']++;
      }
      for (int i = 0; i < str2.length(); i++) {
        arr2[str1.charAt(i) - 'a']++;
      }
      for (int i = 0; i < 26; i++) {
        sum += Math.abs(arr1[i] - arr2[i]);
        arr1[i] = 0;
        arr2[i] = 0;
      }
      System.out.println(sum);
    }
  }
}
