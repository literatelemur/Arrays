/* 
 * Revisits our dice rolling example from earlier, but this time using an array
 * to store the results.
 */
public class DiceRollerPart2 {

	public static void main(String[] args) {
		final int ROLL_COUNT = 1000000;	// How many times to roll the dice
		
		// Index 0 of this array = how many 2s were rolled
		// Index 1 = how many 3s
		// Index 2 = how many 4s
		// ... etc.
		// Index 9 = how many 11s
		// Index 10 = how many 12s
		int[] counts = new int[11];	// All the array elements are initialized to 0 here
		
		for (int i = 0; i < ROLL_COUNT; i++) {
			// Roll the dice and compute their sum
			int		d1 = (int)(6*Math.random()) + 1,
					d2 = (int)(6*Math.random()) + 1;
			int sum = d1 + d2;

			// The index is always 2 less than the sum, so we can use this
			//  single statement instead of setting up a large multibranch conditional
			counts[sum - 2]++;
			
//			if (sum == 2)
//				counts[0]++;
//			else if (sum == 3)
//				counts[1]++;
//			else if (sum == 4)
//				counts[2]++;
//			else if (sum == 5)
//				counts[3]++;
		}

		// Show the results
		for (int i = 0; i < counts.length; i++) {
			double pct = (double)counts[i]/ROLL_COUNT*100;
			System.out.println("Count of " + (i + 2) + ": " + counts[i] + " (" + pct + "%)");
		}
	}
}
