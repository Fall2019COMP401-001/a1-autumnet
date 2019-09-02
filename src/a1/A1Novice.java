package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Read in count of numbers for array
		
		int count = scan.nextInt();
				
		// Create an array
								
		// Read values into the array
				
		for (int i=0; i<count; i++) {
			String first = scan.next();
			String last = scan.next();
			int productNum = scan.nextInt();
			double total = 0;
			for (int j = 0; j<productNum; j++) {
				int a = scan.nextInt();
				String product = scan.next();
				double b = scan.nextDouble();
				total += a*b;
			}
			System.out.println(first.charAt(0)+". "+ last + ": " + String.format("%.2f", total));
		}
		
		// Input finished, close scanner
				
		scan.close();
		
	}
}
