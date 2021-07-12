/************************************************************************************************************************************************************************
  ****************************************************** Print the monthly how much pay for the loan ********************************************************************
  *
  * @author Immanuvel Jeeva
  * @Since  12-07-2021
  *
  ***********************************************************************************************************************************************************************/

import java.util.*;
public class MonthlyPayment {
	
	// Using method for compute payment

	static void payment (double Y, double P, double R)  {

		double n=12*Y;
		double r = R / (12 * 100);
	
		double sum = (P * r) / (1 - Math.pow(1+r,-n));
	
		System.out.println("Monthly Payment = "+Math.round(sum));
	} 

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	// Get input of loan amount,payoff year,interest from user

	System.out.println("Enter the year to payoff loan amount");
	double Y=sc.nextDouble();

	System.out.println("Enter the loan amount");
        double P=sc.nextDouble();
	
	System.out.println("Enter the percentage of interest");
        double R=sc.nextDouble();

	// Function calling

	payment(Y,P,R);

	}
}
