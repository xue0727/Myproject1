package hihi;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
            System.out.println("Please put your coin 1/5/10/50");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            int n = Integer.parseInt(s);
            switch (n) {
                case 1:
                    System.out.println("1");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 10:
                    System.out.println("10");
                    break;
                case 50:
                    System.out.println("50");
                    break;
                default:
                    System.out.println("no");
                    break;
            }
        }


    }

