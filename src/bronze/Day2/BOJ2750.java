package bronze.Day2;

import java.util.*;

public class BOJ2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
      /**  List<Integer> result = new ArrayList<>() {
        };
        for(int i=0; i<a; i++){
            result.add(sc.nextInt());
        }
        result.stream().sorted().forEach(System.out::println);**/
        for (int i = 1; i < N; i++) {
            for(int j = 0; j < N-i; j++){
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(a[i]);

        }


    }
}
