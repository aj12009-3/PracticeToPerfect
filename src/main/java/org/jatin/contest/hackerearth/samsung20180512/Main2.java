//package org.jatin.contest.hackerearth.samsung20180512;
//
//import java.util.Arrays;
//
///**
// * Zero Xor
// A Zero Xor Subset is a non-empty subset having Xor of all the elements in it equal to 0.
// Now you are given an array of N numbers.
// You have to count the number of different Zero Xor Subsets of this array.
//
// Input:
// First line contains a number N
// N is the length of the array.
// Second line contains the N elements of the array.
//
// Output:
// Single number denoting the Count of Zero Xor Subsets of the given array.
//
// Input Constraints:
// 1<=N<=40
// 1<=a[i]<=10^18
//
// Sample Input
// 3
// 1 2 3
// Sample Output
// 1
// Explanation
// For [1, 2, 3] ,there is only 1 subset (1, 2, 3) having Xor (1 ^ 2 ^3) = 0.
// So, the answer is 1.
// */
//
//public class Main2 {
//  public static void main(String[] args) {
//
//  }
//
//  int count (long val, long[] arr){
//    int count = 0;
//    if(arr.length < 1){
//      return 0;
//    }
//    if(arr.length == 1){
//      if((val ^ arr[1]) == 0)
//        count++;
//      return count;
//    }
//
//    count += count(arr[0], Arrays.)
//  }
//}
