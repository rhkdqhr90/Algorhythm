package bronze.Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();

        int[] result = new int[26];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        for (int j = 0; j < text.length; j++) {
            int index = text[j] - 'a';
            if (result[index] == -1) {
                result[index] = j;
            }
        }
        for (int aa : result) {
            System.out.print(aa + " ");

        }

        /*char[] text = br.readLine().toCharArray();

        for (int i = 0; i < 26; i++) {
            int temp = -1;
            for (int j = 0; j < text.length; j++) {
                if (text[j] - 'a' == i) {
                    temp = j;
                    break;
                }
            }
            System.out.print(temp+" ");

        }**/
    }
}
