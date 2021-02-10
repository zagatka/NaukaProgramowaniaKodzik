package Wyjatki;

public class Main {
    public static void main(String[] args){
        System.out.println("Podaj liczbe ");
        Zadanie number = new Zadanie();
        try {
            double dupa = number.getNumber();
            System.out.println("Pierwiastek tej liczby to:  " + number.calculate(dupa));
        }
       catch (IllegalArgumentException e) {
           e.printStackTrace();
       }
        catch (IllegalStateException e) {

        }
    }
}
