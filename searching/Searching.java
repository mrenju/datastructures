import java.util.Scanner;

class Search {
	int[] input;
	
	public Search() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements of the array : ");
		int n = scanner.nextInt();
		this.input = new int[n];
		System.out.println("Enter " + n + " elements : ");
		for(int i = 0; i < n; i++) {
			this.input[i] = scanner.nextInt();
		}
	}
	
	public void linearSearch(int valueToBeSearched) {
		for(int k = 0; k < this.input.length; k++) {
			if(this.input[k] == valueToBeSearched) {
				System.out.println("Search successfull!" + valueToBeSearched + " found at index " + k);
				return;
			}
		}
		System.out.println("Search unsuccessfull!! " + valueToBeSearched + " not found in the array.");
	}
}
public class Searching {
	public static void main(String[] args) {
		Search search = new Search();
		int choice = 1;
		do {
			Scanner sc = new Scanner(System.in);
			int value;
			System.out.println("Enter value to be searched : ");
			value = sc.nextInt();
			System.out.println("1. Linear Search \n2. Binary Search \n3. Exit");
			choice = sc.nextInt();
			switch(choice) {
				case 1: search.linearSearch(value);
				        break;
				case 3: System.out.println("Terminating program.");
						break;
			}
		} while(choice != 3);
	}
}