package org.jatin.contest.hackerearth.dell20180512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Equal Array
 You are given an array A of size N

 Find the minimum non negative number X such that there exist an index j and when you can replace Aj by Aj+X, the sum of elements of array from index 1 to j  and j+1 to  N becomes equal, where 1≤j≤N−1. Assume array to be 1-indexed.

 If there is no possible X print −1 in separate line.

 Input Format

 The first line contains T, the number of test cases.
 For each Test case :
 The first line contains an integer N, size of the array.
 The second line contains N space-separated integers, the ith of which is Ai.

 Input Constraints

 1≤T≤105
 2≤N≤105
 0≤Ai≤106
 Sum of N all over testcases doesn't not exceed 106.

 Output Format

 For each test case, print the required answer in separate line.

 Sample Input
 1
 5
 1 2 3 2 1
 Sample Output
 3
 Explanation
 Add 3 to the 2ndindex(1-indexing).
 */

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(reader.readLine());
    int N;
    long S1;
    long S2;
    long min;
    String[] str;
    Map<Long, Integer> map;
    while (T-- != 0) {
      min = Long.MAX_VALUE;
      S1 = 0;
      S2 = 0;
      N = Integer.parseInt(reader.readLine());
      map = new HashMap<>();
      str = reader.readLine().split(" ");
      for (int i = 0; i < N; i++) {
        S1 += Long.parseLong(str[i]);
        map.put(Long.parseLong(str[i]), 1);
      }

      for (int i = 0; i < N; i++) {
        S2 += Long.parseLong(str[i]);
        S1 -= Long.parseLong(str[i]);
        if(S1 - S2 >= 0 && map.containsKey(S1 - S2)){
          min = S1 - S2 < min ? S1 - S2 : min;
        }
      }
      if(min == 0)
        System.out.println(-1);
      else
        System.out.println(min);
    }
  }
}
