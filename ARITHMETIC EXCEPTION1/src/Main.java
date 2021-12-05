
 import java.util.*;
public class Main {

	public static void main(String[] args) {
		// your code here
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost of the item for n days");
		int item=sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		try {
			int cost=item/n;
			System.out.println("Cost per day of the item is "+cost);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		
		
		}

	

}