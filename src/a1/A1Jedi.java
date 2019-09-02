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
		int[] totalQuants = {0,0,0,0,0,0};
		int[] peoples = {0,0,0,0,0,0};		
		int[] howMany = new int[productCount];
		String[] whichOne = new String[productCount];
		
		for (int j=0; j<customerCount; j++) {
			String first = scan.next();
			String last = scan.next();
			int quantity = scan.nextInt();
			//System.out.println(quantity);
			for (int k=0; k<quantity; k++) {
				//howMany[k] = scan.nextInt();
				int many = scan.nextInt();
				String which = scan.next();
				whichOne[k] = which;
				howMany[k] = many;
				//System.out.println(howMany[k] + whichOne[k]);
				//System.out.println(many + " " + which);
			}
		}
				
		for (int x=0; x<productCount; x++) {
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
		}
		
		for (int p = 0; p<productCount; p++) {
			System.out.println(peoples[p]+ " customers bought " + totalQuants[p] + " " + products[p]);
		}
		//Read in the number of products 
		
		//int customerCount = scan.nextInt();
		
		// Input finished, close scanner
		
		scan.close();	
	}
}
