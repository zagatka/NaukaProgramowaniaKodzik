package Loops;

import java.util.Scanner;

public class Avarage {
    public static void main(String... args) {
        int numberOfClasses = 3;
        int numberOfNotes = 4;
        double[][] note = new double[3][4];
        Scanner inputScanner = new Scanner(System.in);
        double sumA = 0;
        double sumB = 0;

        for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
            for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++) {
                System.out.println("Wprowadz ocene z przedmiotu nr " + noteIndex);
                double x = inputScanner.nextDouble();
                note[classIndex][noteIndex] = x;
                sumA = sumA + x;
            }
            sumB = sumB + sumA;
        }
        System.out.println(sumA/(numberOfClasses*numberOfNotes));


    }

}
