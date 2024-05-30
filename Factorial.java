import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int n,c,fact=1;
        System.out.println("Enter an integer to calculate its factorial :- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        if(n<0){
            System.out.println("Number should be non-negative.");
        }
        else{
            for(c=1;c<=n;c++){
                fact = fact*c;
                System.out.println("Factorial of " + n + "is = "+ fact);
            }
        }
        
    }
    
}
