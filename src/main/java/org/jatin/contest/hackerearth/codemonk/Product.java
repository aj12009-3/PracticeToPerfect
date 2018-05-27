package org.jatin.contest.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(reader.readLine());
    String[] strings = reader.readLine().split(" ");
    long product = 1;
    long modulo = (long) Math.pow(10, 9) + 7;
    for (int i = 0; i < strings.length; i++) {
      product *= Integer.parseInt(strings[i]);
      product %= modulo;
    }
    System.out.println(product);
  }
}
