import java.util.Scanner;
import java.math.BigInteger;

// Class definition
public class LargeFactorial{
    // Main method
    public static void main(String[] args) {
        int n, c; // Declare variables to store input and loop counters
        BigInteger inc = new BigInteger("1"); // Initialize BigInteger variable for increment
        BigInteger fact = new BigInteger("1"); // Initialize BigInteger variable for factorial

        Scanner input = new Scanner(System.in); // Create Scanner object for user input
        System.out.println("Input an Integer :- "); // Prompt user to input an integer
        n = input.nextInt(); // Read integer input from user
        input.close(); // Close the Scanner object to release resources

        // Loop to calculate factorial
        for(c = 1; c <= n; c++) {
            fact = fact.multiply(inc); // Multiply current factorial by increment
            inc = inc.add(BigInteger.ONE); // Increment the value
        }

        // Display the factorial result
        System.out.println(n + "! = " + fact);
    }
}
