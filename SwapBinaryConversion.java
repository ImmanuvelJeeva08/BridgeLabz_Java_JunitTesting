/**
  * First convert decimal into binary
  * Swap the nibbles in bytes
  * check the resultant number is the number of power of 2
  */

import java.util.*;
class SwapBinaryConversion {
	
	// check the resultant number is power of 2 or not

	static void powerOfTwoGeneral(int answer)
 	{
 		while(answer % 2 == 0)
 		{
        		answer=answer/2;
 		}
 		if(answer == 1)
 		{
        		System.out.println("\nYes.The resultant number is power of 2");
 		}
 		else
		{
        		System.out.println("\nNo.The resultant number is not power of 2");
 		}
 	}
	static int swapNibbles(int x)
        {
                return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
        }	

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	// Get input of decimal value from the user

        System.out.println("Enter the number");
        int x=sc.nextInt();

	String value= Integer.toBinaryString(x);
	
	System.out.println("Binary value = "+value);
	int answer=swapNibbles(x);

	System.out.print("Swap NIibble value is = "+answer);
	powerOfTwoGeneral(answer);
 
	}
}

