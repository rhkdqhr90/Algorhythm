package bronze.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class BOJ2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int Max = -1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for (int k = j + 1; k < n; k++) {
                    int temp = A[i] + A[j] + A[k];
                    if (Max < temp && M >= temp) {
                        Max = temp;

                    }
                }
            }
        }
        System.out.println(Max);

    }
}
