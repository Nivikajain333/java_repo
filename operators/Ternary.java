import java.io.*;
 
class Ternary {
    public static void main(String[] args)
    {
 
        // variable declaration
        int n1 = 5, n2 = 10, max;
  
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
        // Syntax variable = expression1 ? expression2 : expression3
        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;
 
        // Print the largest number
        System.out.println("Maximum is = " + max);
    }
}