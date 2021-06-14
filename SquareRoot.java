/**
  * Find the square root of the number using Newton's Method
  */

import java.util.*;
public class SquareRoot {

   // using method find squareroot

   static double squaroot(double c) {
	
       double epsilon = 1e-15;

       double t = c;

       while (Math.abs(t - c / t) > epsilon * t) {
       t = (c / t + t) / 2.0;

      }
	return t; // return the value
   }
 
   public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      // read input from user

      System.out.println("Enter the number");

      double c = sc.nextDouble();

      double sum=squaroot(c);
    
      System.out.println(sum);
   }
}
