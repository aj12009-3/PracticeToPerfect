package org.jatin.contest.hackerearth.samsung20180512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Odd sum problem
 You are given an array A containing N integers. You have to answer Q queries.

 Queries are of form:

 L R

 Here you have to fInd sum of all numbers Ai, for those Ai which has odd frequency in subarray L to R

 INPUT CONSTRAINTS

 1≤N,Q≤10^5
 1≤Ai≤10^9
 1≤L≤R≤N
 INPUT FORMAT

 First line of input contains a single integer N, next line contains N space separated integers, elements of array A. Next line of input contains a single integer Q. Q lines follow each containing two space separated integer L and R.

 OUTPUT FORMAT

 For each query, print the answer to the query in new line.

 Sample Input
 5
 1 2 2 2 1
 3
 1 3
 1 4
 1 5
 Sample Output
 1
 7
 6
 Explanation
 For query 1: 1 has frequency 1 and 2 has frequency 2 so, answer is 1

 For query 2: 1 has frequency 2 and 2 has frequency 3 So, answer is 7


 */

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long output;
    int N = Integer.parseInt(reader.readLine());
    long[] inputArray = new long[N];
    String[] strings = reader.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      inputArray[i] = Long.parseLong(strings[i]);
    }
    int Q = Integer.parseInt(reader.readLine());
    int L, R;
    String[] strings1;
    long[] temp;
    int count;
    while (Q-- != 0) {
      output = 0;
      count = 1;
      strings1 = reader.readLine().split(" ");
      L = Integer.parseInt(strings1[0]);
      R = Integer.parseInt(strings1[1]);
      temp = Arrays.copyOfRange(inputArray, L-1, R);
      Arrays.sort(temp);
      for (int i = 1; i < temp.length; i++) {
        if (temp[i-1] == temp[i]){
          count++;
        }

         else {
          if (count % 2 != 0) {
            output += count * temp[i - 1];

          }
          count = 1;
        }
      }
    if (count % 2 != 0) {
      output += count * temp[temp.length - 1];
    }
      System.out.println(output);
    }

  }
}
