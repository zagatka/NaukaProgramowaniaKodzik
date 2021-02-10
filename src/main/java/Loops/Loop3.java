package Loops;

public class Loop3 {
    public static void getOdds() {
        for (int i = -10; i < 40; i++) {
            if (i % 2 == 1 || i % 2 == -1) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        getOdds();
    }
}
