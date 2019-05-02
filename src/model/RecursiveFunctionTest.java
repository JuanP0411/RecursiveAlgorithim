package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.RecursiveFunctions;
class RecursiveFunctionTest {

	
	@Test
	void FactorialTest() {
		assertTrue(RecursiveFunctions.Factorial(5) == 120,"el factorial de 5 esta mal");
		assertTrue(RecursiveFunctions.Factorial(6) == 720,"el factorial de 6 esta mal");
		assertTrue(RecursiveFunctions.Factorial(8) == 40320,"el factorial de 5 esta mal");
	}
	@Test
	void FibonacciTest() {
		assertTrue(RecursiveFunctions.fibonacci(3) == 2, "el fibonacci en 3 esta mal");
		assertTrue(RecursiveFunctions.fibonacci(5) == 5, "el fibonacci en 3 esta mal");
		assertTrue(RecursiveFunctions.fibonacci(7) == 13, "el fibonacci en 3 esta mal");
	}
	@Test
	void ArraySumatoryTest() {
		int [] array = new int[] {1,2,3,4,5,6,7,};
		int [] array1 = new int[] {2,4,6,8};
		int [] array2 = new int[] {1,3,5,7,9};
		assertTrue(RecursiveFunctions.arraySumatory(array, array.length-1) == 28, "la suma del arreglo no da 28");
		assertTrue(RecursiveFunctions.arraySumatory(array1, array1.length-1) == 20, "la suma del arreglo no da 20");
		assertTrue(RecursiveFunctions.arraySumatory(array2, array2.length-1) == 25, "la suma del arreglo no da 25");
	}
	
	
}
