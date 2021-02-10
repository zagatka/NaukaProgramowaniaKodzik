package Koty;

public class RudyKot implements Kot {
    private int x = 0;
    private String name;

    public void nakarm(){
        x++;
    }

    public String dajGlos() {
        return "miau";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
