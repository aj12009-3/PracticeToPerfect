package org.jatin.contest.hackerrank.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MaxElement {
  public static void main(String[] args) throws IOException{
    Stack<Long> stack = new Stack<>();
    Stack<Long> maxStack = new Stack<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int inputSize = Integer.parseInt(reader.readLine());
    String[] str;
    while (inputSize-- != 0){
      str = reader.readLine().split(" ");
      switch (Integer.parseInt(str[0])){
        case 1 :
          stack.push(Long.parseLong(str[1]));
          if (maxStack.isEmpty()){
            maxStack.push(stack.peek());
          }
          if (stack.peek() >= maxStack.peek())
            maxStack.push(stack.peek());
          break;
        case 2 :
          if (!stack.isEmpty()){
            long popped = stack.pop();
            if ( popped == maxStack.peek())
              maxStack.pop();
          }
          break;
        case 3 :
          if (!maxStack.isEmpty()) {
            System.out.println(maxStack.peek());
          }
      }
    }
  }
}
