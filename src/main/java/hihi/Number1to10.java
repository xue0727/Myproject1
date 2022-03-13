package hihi;

import com.sun.source.tree.IfTree;

import java.util.Random;
import java.util.Scanner;

public class Number1to10 {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        while (play){
            System.out.println("Please enter the number "+min+" to "+max);
            String S =scanner.next();
            int n =Integer.parseInt(S);
            if (n<secret){
                min=n;
                System.out.println("bigger");
            }else if (n>secret){
                max=n;
                System.out.println("smaller");
            }else{
                System.out.println("bingo!");
                play = false;
            }
        }
    }
}



