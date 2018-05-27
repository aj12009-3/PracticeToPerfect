package org.jatin.contest.hackerearth.dell20180512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * One Swap to Palindrome
 You are given T tasks to perform. In each task, you are given a string S of length N. You are allowed to select any two indices i and j (i!=j) of the given string and perform exactly one swap between the characters at these indices.

 If it is possible to make the new string a palindrome then print "Yes", else print "No".

 Note:

 A string is said to be palindrome if it reads same as its reverse form. For example: "madam" , "dad" etc.



 INPUT

 First line contain an integer T denoting total number of tasks to perform.

 Each of the following T lines contains a string S.



 OUTPUT

 For each task, print a single line with "Yes" if it is possible to make palindrome otherwise print "No" without any quotes.



 Constraints:

 1≤T≤5
 2≤N≤100000

 String contains only lowercase English alphabets.

 Sample Input
 1
 bbg

 Sample Output
 Yes
 Explanation
 We can swap indices pair (1,2) [ 0-based ] , so that final string will be "bgb" which is a palindrome.
 */

public class Main2 {
  public static void main(String[] args) throws IOException{
    //int[] chars;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(reader.readLine());
    String str;
    int j;
    int i;
    int valueAtI;
    int valueAtJ;
    int count;
    while (T-- != 0) {
//      str = reader.readLine();
//      //chars = new int[26]
//      i = 0;
//      j = str.length();
//      while (i <= j) {
//        if (str.charAt(i) != str.charAt(j)){
//          if
//        }
//        i++; j--;
//      }
//      for (int k = 0; k < 26 ; k++) {
//        if(chars[k] > 0)
//          count++;
//      }
//      if()
      str = reader.readLine();
      i = 0;
      j = str.length() - 1;
      count = 0;
      valueAtI = -1;
      valueAtJ = -1;
      while (i < j) {
        if (str.charAt(i) != str.charAt(j)){
          if (count == 0) {
            valueAtI = i;
            valueAtJ = j;
            count++;
          }
          else if (count == 1) {
            if ( (str.charAt(i) ^ str.charAt(j) ^ str.charAt(valueAtI) ^ str.charAt(valueAtJ)) == 0)
              count++;
            else{
              System.out.println("No");
              count = -1;
              break;
            }
          }
          else if (count == 2){
            System.out.println("No");
            count = -1;
            break;
          }
        }
        i++; j--;
      }
      if (count == 1){
        if (str.length() % 2 != 0) {
          int mid = str.length() / 2;
          if (str.charAt(valueAtI) == str.charAt(mid) || str.charAt(valueAtJ) == str.charAt(mid)){
            System.out.println("Yes");
          }
        }
        else
          System.out.println("No");
      }
      if (count == 0) {
        System.out.println("No");
      }
      if (count == 2) {
        System.out.println("Yes");
      }
    }
  }
}
