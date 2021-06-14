/**
  * Find the day of the week
  * Give input from user date,month,year
  * Using that formulae find number between 0 to 6
  * Assume 0 for sunday ...till 6 for saturday
  * Finally Print the day of the week
  */

import java.util.*;
class DayofWeek {
	
	// Finding day using the method

	static void dayweek(int d, int m, int y) {

		int y1=y-(14-m)/12;
		int x=y1+(y1/4)-(y1/100)+(y1/400);
		int m1=m+12*((14-m)/12)-2;
		int d1=((d+x+(31*m1)/12)%7);

	System.out.println(d1);

	// Assume 0-6 for sunday-saturday

	switch (d1) {
	
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
                        System.out.println("Monday");
                        break;
		case 2:
                        System.out.println("Tuesday");
                        break;
		case 3:
                        System.out.println("Wednesday");
                        break;
		case 4:
                        System.out.println("Thursday");
                        break;
		case 5:
                        System.out.println("Friday");
                        break;
		case 6:
                        System.out.println("Saturday");
                        break;
		default:
			System.out.println("Some Thing went wrong");	


	}

	}

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);

	// Get input of date,month,year from the user
	
	System.out.println("Enter the date");
	int d =sc.nextInt();

	System.out.println("Enter the month");
        int m =sc.nextInt();
		
	System.out.println("Enter the year");
        int y =sc.nextInt();
	
	// Function calling

	dayweek(d,m,y);
	
	}
}

 	
