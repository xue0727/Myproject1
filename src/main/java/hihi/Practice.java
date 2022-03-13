package hihi;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        Random random = new Random();
        int sec = random.nextInt(100)+1;
        System.out.println(sec);
        Scanner scanner = new Scanner(System.in);
        for (int i=1;i<5;i++){
            System.out.println("Enter the number "+min+" to "+max);
            String s = scanner.next();
            int n = Integer.parseInt(s);
            if (n<sec){
                n=min;
                System.out.println("bigger");
            }else if (n>sec){
                n=max;
                System.out.println("smaller");
            }else {
                System.out.println("bingo!");
                break;
            }
        }
    }
}
