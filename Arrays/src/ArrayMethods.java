/*
 * Some examples of methods involving array parameters and/or
 * return values.
 * 
 */
public class ArrayMethods {

	// This method prints the elements of the array a, in a nice,
	//  aesthetically pleasing fashion.
	public static void printArray(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("]");
	}

	// This method returns the sum of all elements in the array a that
	//  are at least the specified threshold value.  (In other words,
	//  the sum excludes the elements of a that are below the threshold.)
	public static int sumThreshold(int[] a, int threshold) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= threshold)
				sum += a[i];
		}
		return sum;
	}

	// This method combines the arrays x1 and x2 into a new, larger array
	//  and returns that combined array.
	public static int[] combineArrays(int[] x1, int[] x2) {
		int[] result = new int[x1.length + x2.length];
		
		// Copy the elements of x1 into result
		for (int i = 0; i < x1.length; i++)
			result[i] = x1[i];
		
		// Copy the elements of x2 into result
		for (int i = 0; i < x2.length; i++)
			result[i + x1.length] = x2[i];
		
		return result;	// No [] needed here - the declaration of result already specified that it's an array
	}

	// This method searches the array x for a specific element, known as the "key"
	// The search algorithm is very straightforward (literally): start at index 0
	//  and look through the elements one at a time until the key is found, or
	//  until we reach the end of the array.
	// The method returns the index of the key's first occurrence in the array
	//  if found, or -1 if the key is not found.
	public static int linearSearch(int[] x, int key) {
		for (int i = 0; i < x.length; i++) {
			if (key == x[i])
				return i;	// Remember that once a method runs a return statement, it stops execution
		}
		
		// The only way for the method to make it to this point is if
		//  the loop finishes without ever returning anything.  This means
		//  the array must not contain the key, so we return -1.
		return -1;
	}
	
	// Main method to test our methods above
	public static void main(String[] args) {
		int[] x = {7, 10, 8, 3, 4, 6};
		printArray(x);
		
		System.out.println(sumThreshold(x, 0));
		
		int[] x1 = {7, 2, 10, 8, 4};
		int[] x2 = {8, 3, -2};
		printArray(combineArrays(x1, x2));

		System.out.println(linearSearch(x, 7));
		System.out.println(linearSearch(x, 10));
		System.out.println(linearSearch(x, 8));
		System.out.println(linearSearch(x, 3));
		System.out.println(linearSearch(x, 4));
		System.out.println(linearSearch(x, 6));
		System.out.println(linearSearch(x, 60));
	}
}
