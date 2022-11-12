/*
 * Demo of how Java handles pass-by-value in methods.
 * "Pass-by-value" means that when a method is called, the values of the arguments
 * get copied to the parameters of the method.  The method does its work using its
 * own copy of the parameters, meaning that the original arguments are not affected.
 */
public class ParamPassing {
	
	// This swap method performs its actions on its own copies of the
	//  variables x and y, so x and y from main are not affected.
	public static void swap(int x, int y) {
		System.out.println("in swap: x = " + x + ", y = " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("in swap: x = " + x + ", y = " + y);
	}
	
	// This swap method performs its actions on its own copies of the
	//  variables x, index1, and index2.  However, because array variables
	//  are references, the copy of x still points to the same block of memory
	//  as the x reference in main.  Hence, the x in main *is* affected.
	public static void swap(int[] x, int index1, int index2) {
		int temp = x[index1];
		x[index1] = x[index2];
		x[index2] = temp;
	}
	
	public static void main(String[] args) {
//		int x = 5, y = 10;
//		System.out.println("in main: x = " + x + ", y = " + y);
//		swap(x, y);
//		System.out.println("in main: x = " + x + ", y = " + y);
		
		int[] x = {7, 10, 8, 3, 4, 6};
		System.out.println("in main: x[2] = " + x[2] + ", x[5] = " + x[5]);
		swap(x, 2, 5);
		System.out.println("in main: x[2] = " + x[2] + ", x[5] = " + x[5]);
	}
}
