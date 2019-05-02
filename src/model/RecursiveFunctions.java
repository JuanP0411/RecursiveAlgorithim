package model;

public class RecursiveFunctions {
	
	public static int Factorial(int number) {
		
		if(number == 1) {
			return number;
		}else {
			return number*Factorial(number-1);
		}
		
	}
	
	public static int fibonacci(int position) {
		    if(position == 0)
		        return 0;
		    else if(position == 1)
		      return 1;
		   else
		      return fibonacci(position - 1) + fibonacci(position - 2);
		}
	
	public static int arraySumatory(int[]A, int ArrayLength) {
		if(ArrayLength == 0) {
			return A[0];
		}else {
			return A[ArrayLength] + arraySumatory(A,ArrayLength-1);
		}
	}
	

}
