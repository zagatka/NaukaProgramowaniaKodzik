package SklepZoologiczny;

/*

 */

import SklepZoologiczny.Controller.HodowcaController;

public class Main {


    public static void main(String[] args) {
        HodowcaController hodowcaController = new HodowcaController();
        hodowcaController.addCat(12, "Pikus", 4, "bialy");
        hodowcaController.addCat(7, "Rysiek", 3, "siwy" );
        hodowcaController.addDog(7, "Rysiek", 3, "siwy" );
        hodowcaController.addDog(12, "Pikus", 4, "bialy");
        hodowcaController.addFish(2, "Fin", 8);
        hodowcaController.addFish(3, "Finn", 9);

        System.out.println(hodowcaController.getHairColorOfAnyDog("Rysiek"));
        System.out.println(hodowcaController.getFishNumberOfFin("Finn"));
        // TODO dodaj 2 ryby, 2 psy i 2 koty imiona dowolne
        // wyswietl kolor siersci jednego z psów
        // wyswietl ilosc płetw które posiada rybka o danym imieniu.

    }

}
