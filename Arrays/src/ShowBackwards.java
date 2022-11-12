/*
 * Gets user input for 4 numbers and stores them into an array.
 * The program then displays those 4 numbers backwards.
 * 
 */
import java.util.Scanner;

public class ShowBackwards {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] x = new int[4];	// This array stores the user input - right now all the elements are 0
		
		// Get user input for each number and store it into the array
		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter the next integer:");
			x[i] = s.nextInt();
		}

		// Print the array backwards
		for (int i = x.length - 1; i >= 0; i--)
			System.out.println(x[i]);
	}
}
