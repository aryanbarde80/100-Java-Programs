import java.util.*;

public class LargestOfThree{
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter three integers:-  ");
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if(x>y && x>z){
            System.out.println("First no. is largest . ");
        }
        
        else if(y>x && y>z){
            System.out.println("Second no. is largest . ");
        }

        else if(z>x && z>y){
            System.out.println("Third no. is largest . ");
        }

        else{
            System.out.println("Entered numbers are not distinct . ");
        }

        sc.close();
    }
}