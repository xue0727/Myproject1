package hihi;

public class Poker {
    public static void main(String[] args) {
        //Unicode
        int n = 0x00A9;
        System.out.println(n);
        char[] types = {'c', 'd', 'h', 's'};
        //String tt = "cdhs";
        String tt = new String("cdhs");
//        String t3 = new String("cdhs");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print((j+1) + "" +tt.charAt(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
