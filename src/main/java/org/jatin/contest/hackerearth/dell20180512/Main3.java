package org.jatin.contest.hackerearth.dell20180512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Bob and cities
 Bob is living in a city in which houses are arranged in NxM block.

 The city is denoted by N strings having M characters such that '.' denotes house while '#' denotes forests.

 Bob has to pay a certain amount LCost, RCost, UCost, DCost to move 1 step across left, right, up or down respectively.

 Bob lives in a house having co-ordinates (Stx , Sty) (1-Based Indexing).

 You are given Q tasks contains an integer X each. In each task, you have to find number of unique houses (including his house) can be travelled using the amount X.

 INPUT

 First line contains two space separated integers N and M, denoting number of rows and columns respectively.

 Next N lines contain a string each containing M characters. (Note :- Top left corner will denote {1,1} )

 Next line containd four space separated integers denoting LCost, RCost, UCost, DCost respectively.

 Next line contains two space separated integers Stx and Sty, denoting position of Bob's house.

 Next line contains an integer Q denoting number of tasks.

 Next Q lines contain an integer X each, denoting the amount Bob have.

 Output

 For each task, output a single integer denoting the number of unique houses (including his house) Bob can visit using the amount X.

 Constraint

 1 <= N, M <= 1000

 1 <= Stx <= N

 1 <= Sty <= M

 1 <= LCost, RCost, UCost, DCost <= 109

 1 <= Q <= 105

 0  <= X <= 1018

 Sample Input
 3 4
 ..#.
 #...
 ..#.
 1 2 3 4
 2 3
 3
 2
 5
 10
 Sample Output
 3
 7
 9
 Explanation
 As the starting point is {2, 3}.

 In first query Bob has 2 units of money. The total number of unique houses that can be visited are (2,3), (2,2), (2,4). Therefore the answer is 3 .

 Similarly we can check for other 2 queries.
 */

public class Main3 {
  public static void main(String[] args) throws IOException{
    Queue<Pair> queue = new LinkedList<Pair>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] str = reader.readLine().split(" ");
    String temp;
    int N = Integer.parseInt(str[0]);
    int M = Integer.parseInt(str[1]);
    char[][] matrix = new char[N][M];
    for (int i = 0; i < N; i++) {
      temp = reader.readLine().replace(" ", "");
      for (int j = 0; j < M; j++) {
        matrix[i][j] = temp.charAt(j);
      }
    }
    str = reader.readLine().split(" ");
    long LCost = Long.parseLong(str[0]);
    long RCost = Long.parseLong(str[1]);
    long UCost = Long.parseLong(str[2]);
    long DCost = Long.parseLong(str[3]);

    str = reader.readLine().split(" ");
    Pair house = new Pair(Integer.parseInt(str[0]) - 1, Integer.parseInt(str[1]) - 1);
    long count = 0;
    int Q = Integer.parseInt(reader.readLine());
    long X = 0;
    Pair tempPair;
    char[][] tempMatrix = new char[N][M];
    while (Q-- != 0) {
      X = Long.parseLong(reader.readLine());
      house.cost = X;
      queue.add(house);
      count = 0;
      for (int i = 0; i < N ; i++) {
        for (int j = 0; j < M; j++) {
          tempMatrix[i][j] = matrix[i][j];
        }
      }
      while (!queue.isEmpty()){
        tempPair = queue.remove();
        tempMatrix[tempPair.x][tempPair.y] = '#';
        count++;
        if (tempPair.cost - DCost >= 0 && tempPair.x + 1 < N){
          if (tempMatrix[tempPair.x + 1][tempPair.y] == '.'){
            queue.add(new Pair(tempPair.x + 1, tempPair.y, tempPair.cost - DCost));
          }
        }
        if (tempPair.cost - UCost >= 0 && tempPair.x - 1 >= 0){
          if (tempMatrix[tempPair.x - 1][tempPair.y] == '.') {
            queue.add(new Pair(tempPair.x + 1, tempPair.y, tempPair.cost - UCost));
          }
        }
        if (tempPair.cost - RCost >= 0 && tempPair.y + 1 < M){
          if (tempMatrix[tempPair.x][tempPair.y + 1] == '.'){
            queue.add(new Pair(tempPair.x, tempPair.y + 1, tempPair.cost - RCost));
          }
        }
        if (tempPair.cost - LCost >= 0 && tempPair.y - 1 >= 0){
          if (tempMatrix[tempPair.x][tempPair.y - 1] == '.'){
            queue.add(new Pair(tempPair.x, tempPair.y - 1, tempPair.cost - LCost));
          }
        }
      }
      System.out.println(count);
    }
  }

  static class Pair{
    int x;
    int y;
    long cost;
    Pair(int x, int y){
      this.x = x;
      this.y = y;
    }

    Pair(int x, int y, long cost){
      this.x = x;
      this.y = y;
      this.cost = cost;
    }
  }
}
