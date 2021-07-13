/***********************************************************************************************************************************************************************
  *********************************************************** Convert celsious to fahrenheit ***************************************************************************
  *********************************************************** Convert fahrenheit to celsious ***************************************************************************
  *
  * @author Immanuvel Jeeva
  * @Since  12-07-2021
  *
  *********************************************************************************************************************************************************************/

//  Importing packages for round and get two decimal points after point

import java.util.*;
import java.text.DecimalFormat;
import java.math.RoundingMode;
public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat(".##");
	
		// Menu for the operation

		System.out.println("Enter Which Operation you want to perform");
		System.out.println("1.Celsius to Fahrenheit");
		System.out.println("2.Fahrenheit to Celsius");

		int num=sc.nextInt();
		switch (num) {  // Which operation you want to perform

			
			case 1:
				System.out.println("Enter the celsious : ");
				double celsious=sc.nextDouble();
				double sum=((celsious * 9/5) +32);
				df.setRoundingMode(RoundingMode.DOWN);
				System.out.println(celsious+" celsious = " +df.format(sum)+ " Fahrenheit");
				break;
			
			case 2:
				System.out.println("Enter the Fahrenheit : ");
                                double Fahrenheit=sc.nextDouble();
                                double sum1=((Fahrenheit-32)*5/9);
				df.setRoundingMode(RoundingMode.DOWN);
                                System.out.println(Fahrenheit+" Fahrenheit = " +df.format(sum1)+ " celsious");
				break;
		
			default:
				System.out.println("Only two operations");
				System.out.println("So please enter 1 or 2");
		}
	}
}
