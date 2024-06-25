package javaPrograms;

public class countEvenOddNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // Initialize counters for odd and even numbers
        int oddCount = 0;
        int evenCount = 0;
        
        // Iterate through the array
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        // Print the counts
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
	}

}
