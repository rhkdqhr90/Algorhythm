package bronze.day4;

import java.util.Scanner;

public class BOJ2747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[46];
        p[0] = 0;
        p[1] = 1;
        for(int i =2; i <=45; i++){
            p[i] = p[i-1] + p[i-2];
        }

        int result = sc.nextInt();
        System.out.println(p[result]);
    }
}
