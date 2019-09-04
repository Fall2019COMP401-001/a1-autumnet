package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int productCount = scan.nextInt();
		String[] products = new String[productCount];
		
		for (int i=0; i<productCount; i++) {
			products[i] = scan.next();
			double price = scan.nextDouble();
			//System.out.println(products[i]);
		}
		
		int customerCount = scan.nextInt();
		int[] totalQuants = new int[productCount];
		int[] peoples = new int[productCount];		
		//int[] howMany = new int[productCount];
		
		//int sum = 0;
		
		for (int j=0; j<customerCount; j++) {
			boolean[] bought = new boolean[productCount];
			String first = scan.next();
			String last = scan.next();
			//System.out.println(first + " " + last);
			int quantity = scan.nextInt();
			//System.out.println(quantity);
			String[] which = new String[quantity];
			for (int k=0; k<quantity; k++) {
				int howMany = scan.nextInt();
				String whichOne = scan.next();
				which[k] = whichOne;
				for (int f=0; f<productCount; f++) {
					if (products[f].equals(whichOne)) {
						totalQuants[f] += howMany;	
						bought[f] = true;
						
					}
					
				}
				
				
				//howMany[k+sum] = scan.nextInt();
				//whichOne[k+sum] = scan.next();

				//System.out.println(Arrays.toString(howMany));
				//System.out.println(Arrays.toString(whichOne));
			}
			for (int h=0; h<productCount; h++) {
				if (bought[h] == true) {
					peoples[h] += 1;
				}
			}
			
			
			
			//sum += quantity;
			//System.out.println(sum);
			
		}
		for (int x=0; x<productCount; x++) {
			System.out.println(totalQuants[x] + " " + peoples[x]);
		}
		/*for (int x=0; x<productCount; x++) {
			int total = 0; 
			int people = 0; 
			//System.out.println(whichOne[x]);
			for (int y=0; y<productCount; y++) {
				//System.out.println(products[x] + howMany[y] + whichOne[y]);
				if (products[x].equals(whichOne[y])) {
					people += 1;
					total += howMany[y];
					//System.out.println(people + " " + total);
				}
			}
			peoples[x] = people; 
			totalQuants[x] = total;
			//System.out.println(totalQuants[x]);
		}*/
		
		for (int p = 0; p<productCount; p++) {
			if (peoples[p] == 0) {
				System.out.println("No customers bought " + products[p]);
			}
			else {
			System.out.println(peoples[p]+ " customers bought " + totalQuants[p] + " " + products[p]);
			}
		}
		//Read in the number of products 
		
		//int customerCount = scan.nextInt();
		
		// Input finished, close scanner
		
		scan.close();	
	}
}


//public class A1Jedi {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//
//		// Your code follows here.
//		
//		int productCount = scan.nextInt();
//		String[] products = new String[productCount];
//		
//		for (int i=0; i<productCount; i++) {
//			products[i] = scan.next();
//			double price = scan.nextDouble();
//			//System.out.println(products[i]);
//		}
//		
//		int customerCount = scan.nextInt();
//		System.out.println(customerCount);
//		//int[] quantity = new int[customerCount];
//		int sum = 0;
//		
//		int[] totalQuants = new int[productCount];
//		int[] peoples = new int[productCount];		
//		int[] howMany = new int[productCount];
//		String[] whichOne = new String[productCount];
//				
//		for (int j=0; j<customerCount; j++) {
//			String first = scan.next();
//			String last = scan.next();
//			System.out.println(first);
//			System.out.println(last);
//			int quantity = scan.nextInt();
//			System.out.println(quantity);
//			// Loop through products and quantities for each customer and add them to next empty array
//			for (int k=0; k<quantity; k++) {
//				howMany[k] = scan.nextInt();
//				whichOne[k] = scan.next();
//
//				//System.out.println(Arrays.toString(howMany));
//				//System.out.println(Arrays.toString(whichOne));
//			}
//			sum += quantity;
//			for (int y=0; y<productCount; y++) {
//				System.out.println(whichOne[y]);
//			}
//			System.out.println(sum);
//		}
//				
//		for (int x=0; x<productCount; x++) {
//			int total = 0; 
//			int people = 0; 
//			//System.out.println(whichOne[x]);
//			for (int y=0; y<productCount; y++) {
//				//System.out.println(products[x] + howMany[y] + whichOne[y]);
//				if (products[x].equals(whichOne[y])) {
//					people += 1;
//					total += howMany[y];
//					//System.out.println(people + " " + total);
//				}
//			}
//			peoples[x] = people; 
//			totalQuants[x] = total;
//			//System.out.println(totalQuants[x]);
//		}
//		
//		for (int p = 0; p<productCount; p++) {
//			if (peoples[p] == 0) {
//				System.out.println("No customers bought " + products[p]);
//			}
//			else {
//			System.out.println(peoples[p]+ " customers bought " + totalQuants[p] + " " + products[p]);
//			}
//		}
//
//		//Read in the number of products 
//		
//		//int customerCount = scan.nextInt();
//		
//		// Input finished, close scanner
//		
//		scan.close();	
//	}
//}
