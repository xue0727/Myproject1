package hihi;

import java.util.Scanner;

public class Vending2 {
    public static void main(String[] args) {
        /*
        drink a $20
        drink b $15
        drink c $30
        drink d $23
        drink e $45
        drink f $32
         */
        int total = 0;
        int[] prices = {20,15,30,23,45,32};
        //System.out.println(prices.length);
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i]+" ");
        }
        System.out.println();
        boolean pay = false;
        while(!pay){
        System.out.println("Please put your coin 1/5/10"+" Total:"+ total);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        switch (s) {
            case "1":
            case "5":
            case "10":
                int n = Integer.parseInt(s);
                total = total + n;
                break;
            case "a":
            case "b":
            case "c":
            case "d":
            case "e":
            case "f":
                int drink = s.charAt(0)-97;
                        if(total >= prices[drink]) {
                            total = total - prices[drink];
                            System.out.println("Dom!");
                        }else{
                            System.out.println("Beep!");
                        }
                        break;
            case "end":
                int coin10 = total/10;
                int coin5 = (total-10*coin10)/5;
                int coin1 = (total%5);
                System.out.println("Give changes "+total);
                System.out.println(" 10 have "+coin10+" , 5 have "+coin5+" , 1 have "+coin1);
                pay = true;
                break;
            default:
                System.out.println("error");
                break;
        }
    }
        System.out.println("Thank you for purchasing");

}
}

