package SklepZoologiczny.Controller;

import SklepZoologiczny.Service.ShopService;

// TODO napraw klase
public class HodowcaController {
    ShopService shopService = new ShopService();

    public void addFish(int age, String name, int numberOfFin) {
        shopService.addNewFish(age, name, numberOfFin);
    }

    public void addCat(int age, String name, int noOfPaws, String hairColour) {
        shopService.addNewCat(age, name, noOfPaws, hairColour);
    }

    public void addDog(int age, String name, int noOfPaws, String hairColour) {
        shopService.addNewDog(age, name, noOfPaws, hairColour);
    }

    public int getFishNumberOfFin(String name) {
       return shopService.getFishByName(name).getNumberOfFin();
    }

    public String getHairColorOfAnyDog(String name) {
        return shopService.getDogByName(name).getHairColour();
    }
}
