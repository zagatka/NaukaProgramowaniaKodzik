package SklepZoologiczny.Service;

import SklepZoologiczny.Model.Cat;
import SklepZoologiczny.Model.Dog;
import SklepZoologiczny.Model.Fish;

import java.util.ArrayList;
import java.util.List;

public class ShopService {

    private List<Dog> dogList = new ArrayList<>();
    private List<Fish> fishList = new ArrayList<>();
    private List<Cat> catList = new ArrayList<>();

    // TODO dodaj psa do sklepu
    public void addNewDog(int age, String name, int noOfPaws, String hairColour) {
    dogList.add(new Dog(age, name, noOfPaws, hairColour));
    }

    // TODO dodaj kota do sklepu
    public void addNewCat(int age, String name, int noOfPaws, String hairColour) {
    catList.add(new Cat(age, name, noOfPaws, hairColour));
    }

    public void addNewFish(int age, String name, int numberOfFin) {
        fishList.add(new Fish(age, name, numberOfFin));
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public List<Fish> getFishList() {
        return fishList;
    }

    public Fish getFishByName(String name) {
        for(int i = 0; i < fishList.size(); i++){
            if(fishList.get(i).getName().equals(name)){
                return fishList.get(i);
            }
        }
        return null;
    }

    public Cat getCatByName(String name) {
        for(int i = 0; i < catList.size(); i++){
            if(catList.get(i).getName().equals(name)){
                return catList.get(i);
            }
        }
        return null;
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public Dog getDogByName(String name) {
        for(int i = 0; i < dogList.size(); i++){
            if(dogList.get(i).getName().equals(name)){
                return dogList.get(i);
            }
        }
        return null;
    }
}
