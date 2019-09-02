package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Read in count of numbers for array
		
		int productCount = scan.nextInt();
		String[] products = new String[productCount];
		double[] prices = new double[productCount];
		
		
		//System.out.println(productCount + customerCount);
		
		for (int i=0; i<productCount; i++) {
			//String product = scan.next();
			products[i] = scan.next();
			prices[i] = scan.nextDouble();
			//price = scan.nextDouble();
			//System.out.println(products[i] + " " + prices[i]);
		}
		
		int customerCount = scan.nextInt();
		String[] firstNames = new String[customerCount];
		String[] lastNames = new String[customerCount];
		double[] totals = new double[customerCount];
		
		for (int j=0; j<customerCount; j++) {
			firstNames[j] = scan.next();
			lastNames[j] = scan.next();
			int quantity = scan.nextInt();
			double total = 0;
			for (int k=0; k<quantity; k++) {
				int howMany = scan.nextInt();
				//whichOne[k] = scan.next();
				String whichOne = scan.next();
				for (int x=0; x<productCount; x++) {
					if (whichOne.equals(products[x])) {
					    double cost = prices[x] * howMany;
					    total += cost;
					}
			
				}
					
			}
			totals[j] = total;
			//System.out.println(totals[j]);
		}
		//Read in the number of products 
		
		//int customerCount = scan.nextInt();
		
		// Input finished, close scanner
		
		scan.close();	
		
		double average = totalsAverage(totals);
		double highest = findTotalsHigh(totals);
		double lowest = findTotalsLow(totals);
		
		for (int p = 0; p<totals.length; p++) {
			if (totals[p]==(highest)) {
				System.out.println("Biggest: " + firstNames[p] + " " + lastNames[p] + "(" + String.format("%.2f", highest) + ")");
			}
		}
		
		for (int q = 0; q<totals.length; q++) {
			if (totals[q]==(lowest)) {
				System.out.println("Smallest: " + firstNames[q] + " " + lastNames[q] + "(" + String.format("%.2f", lowest) + ")");
			}
		}
		System.out.println("Average: " + String.format("%.2f", average));
	}
	
	static double totalsAverage(double[] totals) {
		
		double sum = 0;
		double average = 0;
		
		for (int i=0; i<totals.length; i++) {
			sum += totals[i];
			average = sum / totals.length;
		}
		
		return average;
	}
	
	static double findTotalsLow(double[] totals) {
		
		// Initialize current minimum to first value in array.
		double lowNow = totals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i<totals.length; i++) {
			if (totals[i] < lowNow) {
				lowNow = totals[i];
			}
		}
		
		return lowNow;
	}
	
	static double findTotalsHigh(double[] totals) {
		
		// Initialize current minimum to first value in array.
		double highNow = totals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < totals.length; i++) {
			if (totals[i] > highNow) {
				highNow = totals[i];
				
			}
			
		}
		
		return highNow;
	}
	
}
