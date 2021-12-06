import java.util.Scanner;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
		
		System.out.println("Enter the name");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("Enter the bankname");
		String b = sc.nextLine();
		System.out.println("Enter the IFSC Code");
		String c = sc.nextLine();
		System.out.println("Enter the aadhar id");
		String d = sc.nextLine();
		System.out.println("Enter the amount");
		int e  = sc.nextInt();
		System.out.println("1)Pay using name, bankname and IFSC code\r\n"
				+ "2)Pay using aadharid and IFSC code\r\n"
				+ "Enter your choice");
		int f  = sc.nextInt();
		System.out.println("Enter the payee account name");
		String g = sc.nextLine();
		System.out.println("Enter their bankname");
		String h = sc.nextLine();
		System.out.println("Enter their IFSC Code");
		String i = sc.nextLine();
		System.out.println("Enter the amount to deposite");
		int j = sc.nextInt();
		if(j<=10) {
			System.out.println("Payee not found from given match");
		}
		System.out.println("Amount deposited successfully");
		System.out.printf("Current balance of Kumar account is %.1f "+(e+j));
		
		
		
		
		
		
		
		
		
		
		
	}

}
