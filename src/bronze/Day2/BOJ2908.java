package bronze.Day2;


import java.util.Scanner;

public class BOJ2908 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();

        char temp = A[0];
        A[0] = A[2];
        A[2] = temp;

        temp = B[0];
        B[0] = B[2];
        B[2] = temp;

        int revers = Integer.parseInt(new String(A));
        int revers2 = Integer.parseInt(new String(B));

        System.out.println(Math.max(revers, revers2));






    }
}
