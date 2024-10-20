package bronze.Day1;

import java.io.IOException;
import java.util.Scanner;

public class BOJ1152 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine().trim();
        String[] array = st.split(" ");

        if (st.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.printf(String.valueOf(array.length));

        }

    }
}
