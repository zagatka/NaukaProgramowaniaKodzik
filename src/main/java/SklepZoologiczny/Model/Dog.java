package SklepZoologiczny.Model;

// TODO rozszez klase Cat o Animal oraz dodaj parametr okreslający ilośc łap (int) i kolor sierści (String) (zastanów sie i mi odpowiedz, czy nie bylo by tu fajnie stworzyc dodatkowej klasy
// po ktorej dziedziczylyby i Cat i Dog ?
public class Dog extends Animal{
    private int noOfPaws;
    private String hairColour;

    public Dog(int age, String name, int noOfPaws, String hairColour){
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
