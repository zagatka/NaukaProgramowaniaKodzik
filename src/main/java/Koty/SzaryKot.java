package Koty;

public class SzaryKot implements Kot{
    int x = 0;
    public void nakarm(){
        x = x + 2;
    }

    public String dajGlos() {
        return "mrrrr";
    }
}
