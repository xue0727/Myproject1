package hihi;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        Random random = new Random();
        int sec = random.nextInt(100)+1;
        System.out.println(sec);
        Scanner scanner = new Scanner(System.in);
        boolean Play = true;
        while (Play){
            System.out.println("enter the number "+min+"to "+max);
            String s = scanner.next();
            int n = Integer.parseInt(s);
            if (n<sec){
                n=min;
                System.out.println("bigger");
            }else if (n>max){
                n=max;
                System.out.println("smaller");
            }else{
                System.out.println("bingo");
                Play = false;
                break;
            }
        }
    }
}
