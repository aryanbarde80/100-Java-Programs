//How to generate random numbers in java
import java.util.*;
public class RandomNumbers{
    public static void main(String[] args) {
        int c;
        Random t = new Random();
        //random integers in [0,100]

        for(c=1;c<=10;c++){
            System.out.println(t.nextInt(100));
        }
    }
}

//10 random numbers between 1 to 10