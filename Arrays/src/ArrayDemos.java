/*
 * Some basic examples of array syntax.
 */
public class ArrayDemos {

	public static void main(String[] args) {
		int[] y = new int[10];	// Array declaration and instantiation, combined into one line.
								// At this point, all array elements are 0.
		
		// Store values into specific array indices.
		// (Be careful that the indices are always within the bounds of the array!)
		y[2] = 10;
		y[1] = 8;
		y[5] = 11;

		// Print out the individual array elements
		for (int i = 0; i < y.length; i++)
			System.out.println(y[i]);
	}
}
