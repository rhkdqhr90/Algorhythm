package bronze.Day3;

import java.util.Scanner;

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            boolean flag = true;
            if(temp==1) flag = false;
            else{
                for(int j=2; j<=Math.sqrt(temp); j++){
                    if(temp%j==0){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) count++;
        }
        System.out.println(count);

    }
}
