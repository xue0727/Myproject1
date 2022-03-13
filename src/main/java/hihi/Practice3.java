package hihi;

import java.util.Random;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        Random random = new Random();
        int sec = random.nextInt(100)+1;
        System.out.println(sec);
        Scanner scanner = new Scanner(System.in);
        Boolean Play = false;
        for (int i=0;i<5;i++){
            System.out.println("Enter the number "+min+"to "+max);
            String s = scanner.next();
            int n = Integer.parseInt(s);
            if (n<sec){
                n=min;
                System.out.println("bigger");
            }else if (n>sec){
                n=max;
                System.out.println("smaller");
            }else {
                System.out.println("bingo");
                Play = true;
                break;
            }
        }if (Play){
            System.out.println("You win");
        }else{
            System.out.println("You lose");
        }
    }
}
