package org.jatin.contest.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(reader.readLine());
    for (int i = 2; i <= N ; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
  static boolean isPrime(int n) {
    int val = (int)Math.sqrt(n) + 1;
    for (int i = 2; i < val; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
