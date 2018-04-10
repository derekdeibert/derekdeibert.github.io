




import java.util.Scanner;

public class indexOfLargest1 {
	
	public void index() {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10]; // Create an array of length ten

		// Prompt the user to enter ten numbers
		System.out.println("Enter ten integers: ");
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();}

		// Display the smallest value
		System.out.print("Entered Integers: ");
      for (int i = 0; i < numbers.length; i++){
			System.out.print(+numbers[i]+" ");}
      System.out.println();
      System.out.println("Index of Largest Value: " +findIndex(numbers));
			
	}

	
	public static int findIndex(int[] array) {
		if (array.length <= 1)
			return 0;
		
		int largest = array[0];
		int maximumIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
				maximumIndex = i;
			}
		}
		return maximumIndex;
	}
}