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
	
	

	public static boolean palindrome(String n) {
		return palindrome(n,0,n.length()-1);
	}
	
	private static boolean palindrome(String n, int start, int end) {
		if(start == end) {
			return palindrome(n,start+1,end-1);
		}else if(n.charAt(start) == n.charAt(end)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String Invert(String n, int length) {
		if(length == 0) {
			return ""+n.charAt(length);
		}else {
			return "" +n.charAt(length)+Invert(n,length-1); 
		}
	}
	
	public static void main(String [] args) {
		String n = "nicolas";
		System.out.println(Invert(n,n.length()-1));
	}
	
	
}
