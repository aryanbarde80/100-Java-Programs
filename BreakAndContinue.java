import java.util.Scanner;
//This Program Takes Input Until Zero Is Entered!!
public class BreakAndContinue {
    
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input an Integer: ");
            n = sc.nextInt();

            if (n != 0) {
                System.out.println("You entered " + n);
                continue;
            } else {
                break;
            }
        }
        sc.close();
    }
}

