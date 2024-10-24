package bronze.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());
      /**  long X = 1;
        while(A+(B*X) >= C*X){
            if(B>=C){
                X = -1;
                break;
            }
            X++;
        }
        System.out.println(X);**/
        System.out.println(A/(C-B)+1);

    }
}
