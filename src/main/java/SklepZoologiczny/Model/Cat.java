package SklepZoologiczny.Model;

// TODO rozszez klase Cat o Animal oraz dodaj parametr okreslający ilośc łap (int) i kolor sierści (String)
public class Cat extends Animal {
    private int noOfPaws;
    private String hairColour;

    public Cat(int age, String name, int noOfPaws, String hairColour){
        super(age, name);
        this.noOfPaws = noOfPaws;
        this.hairColour = hairColour;
    }

    public int getNoOfPaws() {
        return noOfPaws;
    }

    public void setNoOfPaws(int noOfPaws) {
        this.noOfPaws = noOfPaws;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }
}
