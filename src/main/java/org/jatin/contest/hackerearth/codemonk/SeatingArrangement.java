package org.jatin.contest.hackerearth.codemonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeatingArrangement {
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(reader.readLine());
    int N;
    while (T-- != 0) {
      N = Integer.parseInt(reader.readLine());
      System.out.println(oppSeat(N) + " " + position(N));
    }
  }
  static int oppSeat (int seatNo) {
    int div = (seatNo - 1) / 6;
    int i = 0;
    int j = 0;
    int oppPos = 0;
    if (div % 2 == 0) {
      i = 6 * div + 1;
      j = 6 * (div + 1) + 6;
      while (i != seatNo) {
        i++;
        j--;
      }
      oppPos = j;
    }else {
      i = 6 * (div - 1) + 1;
      j = 6 * div + 6;
      while (j != seatNo) {
        i++;
        j--;
      }
      oppPos = i;
    }
    return oppPos;
  }
  static String position(int seatNo){
    int pos = seatNo % 6;
    if (pos == 1 || pos == 0 ) {
      return "WS";
    }
    else if (pos == 2 || pos == 5 ) {
      return "MS";
    }
    else {
      return "AS";
    }
  }
}
