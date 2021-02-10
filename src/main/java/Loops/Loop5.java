package Loops;

public class Loop5 {

    public Loop5() {
    }

    public int sum(int tab[]){
       int sum=0;
       for(int element : tab){
           sum = sum + element;
       }
       System.out.println(sum);
       return sum;
    }

}

