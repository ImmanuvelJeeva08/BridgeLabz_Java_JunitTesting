/**
  * Get input of decimal and convert into binary
  */

import java.util.*;
public class ToBinary {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	// Get input of decimal from the user
	
	System.out.println("Enter the Decimal Number");
	int num=sc.nextInt();
	int index=0;
	int sum[] = new int[40];
	
	// Converting decimal to binary using while loop
		
	while ( num > 0) {
			
			sum[index++] = num % 2;
			num = num / 2;
	}
	
	// Print th elements in an array
	
	for(int i= index-1; i >= 0; i--) {
		System.out.println(sum[i]);
	}
	}
}
