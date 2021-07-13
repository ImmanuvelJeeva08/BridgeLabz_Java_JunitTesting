import java.util.Scanner;

public class VendingMachine {

	public static void countCurrency(int amount, int notes[], int ArraySize, int noteCounter[]) {
        	for (int i = 0; i < ArraySize; i++) {
            		if (amount >= notes[i]) {     
                		noteCounter[i] = amount / notes[i];
                		countCurrency(amount - noteCounter[i] * notes[i], notes, ArraySize, noteCounter);
				return;
            		}
        	}
    	}



    public static void main(String[] args) {

	// Get the amount as input from User

        Scanner input = new Scanner(System.in);
        int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
        int[] noteCounter = new int[8];
        System.out.print("Enter the amount of change to be returned by the Vending Machine = Rupees ");
        int amount = input.nextInt();
        int ArraySize = notes.length;

	// Method Calling
        countCurrency(amount, notes, ArraySize,noteCounter);


	// Print the notes of changing amount
	System.out.println("Currency Count in every notes :");
                for (int i = 0; i < ArraySize; i++) {
                        if (noteCounter[i] != 0) {
                                System.out.println(notes[i]+ " Rupees = " +noteCounter[i]+ " notes ");
                        }
                }

    }
}
