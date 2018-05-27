package org.jatin.contest.hackerearth.codemonk.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DNAPride {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(reader.readLine());
    int N= 0;
    String dna;
    StringBuilder string;
    boolean flag;
    while (T-- != 0){
      N = Integer.parseInt(reader.readLine());
      dna = reader.readLine();
      string = new StringBuilder("");
      flag = true;
      for (int i = 0; i < N; i++) {
        if (!isRNA(dna.charAt(i))){
          string.append(returnPair(dna.charAt(i)));
        }else{
          flag = false;
          break;
        }
      }
      if (flag){
        System.out.println(string.toString());
      }
    }
  }
  static boolean isRNA(char c){
    if (c == 'U'){
      System.out.println("Error RNA nucleobases found!");
      return true;
    }
    else
      return false;
  }
  static char returnPair(char c) {
    if (c == 'A'){
      return 'T';
    }
    else if (c == 'T'){
      return 'A';
    }
    else if (c == 'C'){
      return 'G';
    }
    else if (c == 'G'){
      return 'C';
    }
    return '\0';
  }
}
