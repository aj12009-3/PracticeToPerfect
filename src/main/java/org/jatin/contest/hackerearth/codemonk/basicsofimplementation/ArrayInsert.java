package org.jatin.contest.hackerearth.codemonk.basicsofimplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayInsert {
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] strings = reader.readLine().split(" ");
    long N = Integer.parseInt(strings[0]);
    int Q = Integer.parseInt(strings[1]);
    ArrayList<Integer> arr = new ArrayList<>();
    strings = reader.readLine().split(" ");
    for (int i = 0; i < N; i++) {
      arr.add(Integer.parseInt(strings[i]));
    }
    int sum = 0;
    while (Q-- != 0){
      sum = 0;
      strings = reader.readLine().split(" ");
      if (Integer.parseInt(strings[0]) == 1){
        arr.set(Integer.parseInt(strings[1]), Integer.parseInt(strings[2]));
      }
      if (Integer.parseInt(strings[0]) == 2){
        int L = Integer.parseInt(strings[1]);
        int R = Integer.parseInt(strings[2]);
        for (int i = L; i <= R ; i++) {
          sum += arr.get(i);
        }
        System.out.println(sum);
      }
    }
  }
}
