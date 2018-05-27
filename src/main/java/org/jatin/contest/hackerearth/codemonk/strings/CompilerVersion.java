package org.jatin.contest.hackerearth.codemonk.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompilerVersion {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String line = reader.readLine();
    StringBuilder out;
    boolean flag;
    while (line!=null) {
      flag = false;
      int length = line.length();
      out = new StringBuilder();
      for (int i = 0; i < length; i++) {
        if (line.charAt(i) == '/' && (i+1) < length && line.charAt(i+1) == '/') {
          out.append(line.substring(i));
          break;
        }
        if (line.charAt(i) == '-' && (i+1) < length && line.charAt(i+1) == '>') {
          out.append('.');
          i++;
        }else {
          out.append(line.charAt(i));
        }
      }
      System.out.println(out.toString());
      line = reader.readLine();
    }
  }
}
