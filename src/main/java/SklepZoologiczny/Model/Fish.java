package SklepZoologiczny.Model;

public class Fish extends Animal {

    private int numberOfFin;

    public Fish(int age, String name, int numberOfFin) {
        super(age, name);
        this.numberOfFin = numberOfFin;
    }

    public int getNumberOfFin() {
        return numberOfFin;
    }

    public void setNumberOfFin(int numberOfFin) {
        this.numberOfFin = numberOfFin;
    }

}
