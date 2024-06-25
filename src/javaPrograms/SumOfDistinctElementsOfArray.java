package javaPrograms;

import java.util.HashSet;

public class SumOfDistinctElementsOfArray {

	public static void main(String[] args) {
		int[] array =	{5,1,8,4,9,1,5};

		  HashSet<Integer> set = new HashSet();
		  int sum = 0;

	        for (int num : array) {
	            if (set.add(num)) { // Add returns true if num was not already in the set
	                sum = sum+num;
	                      }

                        }
	        System.out.println("Sum of distinct elements: "+sum);
}
}
/* 1.HashSet: HashSet is used to store distinct elements because it does not allow duplicate elements.

2.Adding Elements: As we iterate through the array, we use set.add(num). 
This method adds num to the HashSet only if it's not already present (i.e., it returns true).
 If num is added (indicating it's distinct), we add num to our sum





*/