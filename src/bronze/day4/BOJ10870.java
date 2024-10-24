package bronze.day4;


import java.util.Scanner;


public class BOJ10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[21];
        result[0]  =0;
        result[1]  =1;
        for(int i= 2; i<=20;i++){
            result[i] = result[i-1] + result[i-2];
        }
        int n = sc.nextInt();
        System.out.println(result[n]);


    }
}
