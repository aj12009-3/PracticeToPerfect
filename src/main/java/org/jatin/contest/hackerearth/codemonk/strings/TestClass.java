package org.jatin.contest.hackerearth.codemonk.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestClass{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T = 0;
    try{
      T = Integer.parseInt(reader.readLine());
    }catch (Exception e){
      System.out.println("Invalid Test");
    }
    String s = null;
    char[] arr;
    int check;
    int upperCount, lowerCount;
    if(T < 1 || T > 10){
      System.out.println("Invalid Test");
      //return;
    }
    else{
      while((T--)!=0){
        upperCount = lowerCount = 0;
        s = reader.readLine();
        if(s.length()<1 || s.length() > 100){
          System.out.println("Invalid Input");
          continue;
        }
        arr = s.toCharArray();
        for(int i = 0; i < arr.length ; i++){
          check = arr[i];
          if(check >= 65 && check <= 90)
            upperCount++;
          if(check >= 97 && check <= 122)
            lowerCount++;

        }
        if(upperCount == 0 && lowerCount == 0){
          System.out.println("Invalid Input");
          continue;
        }
        System.out.println(upperCount<=lowerCount?upperCount:lowerCount);

      }
    }
  }
}