  import java.util.Scanner;
 
 class Main
 {
	 public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 System.out.println("Enter the transaction details\r\n"
		 		+ "Enter the account number");
		 System.out.println("Enter the available amount");
		 Transaction t = new Transaction(s.nextLine(),Double.parseDouble(s.nextLine()));
		 
		 try
		 {
			 do
			 {
				 System.out.println("Enter the transaction amount");
				 Double d=Double.parseDouble(s.nextLine());
				 t.validate(d);
				 t.setAccount(t.getAmount()-d);
				 System.out.println("Do you want to enter more ?(yes/no)");
			 }
			 while(s.nextLine().equals("yes"));
			 
		 }
		 catch(Exception e)
		 
		 {
			 System.out.println("Insufficient Balance");
		 }
		 
		 finally
		 {
			 System.out.printf("Your available balance%.1f",t.getAmount()); 
				 
			 }
		 }
	 }
	 