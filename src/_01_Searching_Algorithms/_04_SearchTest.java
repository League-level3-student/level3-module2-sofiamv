package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] testone = {"one", "two", "three", "four", "five"};
		String[] testtwo = {"six", "seven", "eight", "nine", "ten"};
		String[] testthree = {"eleven", "twelve", "thirteen", "fourteen", "fifteen"};
		assertEquals(2, _00_LinearSearch.linearSearch(testone, "three"));
		assertEquals(4, _00_LinearSearch.linearSearch(testtwo, "ten"));
		assertEquals(3, _00_LinearSearch.linearSearch(testthree, "fourteen"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] testone = {1, 2, 3, 4, 5};
		int[] testtwo = {6, 7, 8, 9, 10};
		int[] testthree = {11, 12, 13, 14, 15};
		assertEquals(2, _01_BinarySearch.binarySearch(testone,0, testone.length-1, 3));
		assertEquals(3, _01_BinarySearch.binarySearch(testtwo,0, testtwo.length-1, 9));
		assertEquals(1, _01_BinarySearch.binarySearch(testthree,0,testthree.length-1,12));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
