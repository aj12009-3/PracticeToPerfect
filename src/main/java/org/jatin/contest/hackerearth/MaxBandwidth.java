package org.jatin.contest.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class MaxBandwidth {
    public static void main(String[] args) throws IOException{
        int T, N;
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(reader.readLine());
        String[] temp;
        long max = 0;
        long matrix[][];
        while((T--) > 0){
            N = Integer.parseInt(reader.readLine());
            matrix = new long[2*N][2];
            for(int i = 0 ; i < 2*N ; i+=2){
                temp = reader.readLine().split(" ");
                matrix[i][0] = Long.parseLong(temp[0]);
                matrix[i][1] = Long.parseLong(temp[2]);
                matrix[i+1][0] = Long.parseLong(temp[1]);
                matrix[i+1][1] = -1*Long.parseLong(temp[2]);

            }
            Arrays.sort(matrix, new Comparator<long[]>() {
                @Override
                public int compare(long[] o1, long[] o2) {
                    if(o1[0] < o2[0]){
                        return -1;
                    }
                    if(o1[0] > o2[0]){
                        return 1;
                    }
                    return 0;
                }
            });
            for(int i = 0 ; i < 2*N ; i++){
                long value = 0;
                value = matrix[i][1] + max;
                if(value > max){
                    max = value;
                }
            }
            System.out.println(max);
        }
    }
}
