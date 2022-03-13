package hihi;

public class Starline {
    public static void main(String[] args) {
        for(int i =0; i<11; i++) {
            for (int j=0; j<11; j++) {
                if(2*i==j||2*i==20-j) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
