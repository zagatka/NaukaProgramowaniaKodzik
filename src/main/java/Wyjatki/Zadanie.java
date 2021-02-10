package Wyjatki;

import java.util.Scanner;

public class Zadanie {
    public double getNumber (){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        if (a<0){
            throw new IllegalArgumentException();
        }
        if (a==0) {
            throw new RuntimeException();
        }
        return a;
    }

    public double calculate(double a){
        double b = Math.sqrt(a);
        return b;
    }

}
