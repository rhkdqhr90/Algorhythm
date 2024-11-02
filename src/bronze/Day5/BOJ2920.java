package bronze.Day5;

import java.util.Scanner;

public class BOJ2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean fix = true;
        if (n == 1) {
            for (int i = 2; i < 9; i++) {
                int temp = sc.nextInt();
                if (temp != i) {
                    fix = false;
                    System.out.println("mixed");
                    return;
                }
            }
            if (fix) {
                System.out.println("ascending");

            }
        } else if (n == 8) {
            for (int i = 8; i > 0; i--) {
                int temp = sc.nextInt();
                if (temp != i) {
                    fix = false;
                    System.out.println("mixed");
                    return;
                }
            }
            if (fix) {
                System.out.println("descending");

            }
        } else {
            System.out.println("mixed");
        }
    }
}
