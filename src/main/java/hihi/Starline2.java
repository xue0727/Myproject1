package hihi;

public class Starline2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for(int j = 0 ;j < 20; j++){
              if(i==0 || j==19 || i==9 || j==0) {
                  System.out.print("*");
              }else if (j>=2 && i>=2 && j<=17 && i<=7){
                  System.out.print('*');
              }else{
                  System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}
