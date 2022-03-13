package hihi;

import java.util.Random;
import java.util.Scanner;

public class Number1to100 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the number " + min + " ~ " + max);
            String s = scanner.next();
            int n = Integer.parseInt(s);

            if (n > secret) {
                max = n;
                System.out.println(min + "~" + max);
            } else if (n < secret) {
                min = n;
                System.out.println(min + "~" + max);
            } else {
                System.out.println("bingo!");
            }
        }
        System.out.println("881~");
    }
}
