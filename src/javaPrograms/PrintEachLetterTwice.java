package javaPrograms;

public class PrintEachLetterTwice {


		    public static void main(String[] args) {
		        String input = "Hello, World!";
		        
		        System.out.println("Original String: " + input);
		       System.out.print("Each letter twice: ");
		        
		        // Iterate through each character in the string
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            // Print each character twice
		            System.out.print(ch);
		            System.out.print(ch);
		        }
		        
		        System.out.println(); // Print a new line at the end
		    }
		

	}


