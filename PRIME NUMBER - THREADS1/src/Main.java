
 import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		System.out.println("Prime number between 1 to "+no);
		PrimeNumber pn=new PrimeNumber();
		pn.setNumber(no);
		Thread t=new Thread(pn);
		t.start();
		
		
	}

}