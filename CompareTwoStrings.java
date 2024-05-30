import java.util.*;

public class CompareTwoStrings{
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:- ");
        s1 = sc.nextLine();
        System.out.println("Enter the second string :- ");
        s2 = sc.nextLine();

        sc.close();

        if(s1.compareTo(s2)>0){
            System.out.println("first string is greater than second.");
        }

        else if(s1.compareTo(s2)<0){
            System.out.println("first is smaller than second.");
        }

        else{
            System.err.println("Both strings are equal..");
        }

    }
}