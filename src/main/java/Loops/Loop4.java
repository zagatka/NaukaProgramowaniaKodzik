package Loops;

public class Loop4 {
    public static void getOdds() {
        int i = -10;
        while(i < 40){
            if (i % 2 == 1 || i % 2 == -1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
