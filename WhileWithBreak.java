import java.util.Scanner;

public class WhileWithBreak {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Input an Integer:- ");
            n = sc.nextInt();
            sc.close();
            if(n==0){
                break;
            }
            System.out.println("You entered " + n);
        }
    }
    
}
