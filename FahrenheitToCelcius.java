import java.util.*;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        
        float temperature;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in fahreheit:- ");
        temperature = sc.nextInt();
        temperature = ((temperature-32)*5)/9;

        System.out.println("Temperature in celcius = " + temperature);

        sc.close();
    }
    
}
