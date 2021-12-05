 import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		// fill your code here
    	Scanner sc=new Scanner(System.in);
    	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    	System.out.println("Enter the issue date as dd/MM/yyyy");
    	String issueDate=sc.nextLine();
    	System.out.println("Enter the due date as dd/MM/yyyy");
    	String dueDate=sc.nextLine();
    	System.out.println("Enter the original amount");
    	String originalAmount=sc.nextLine();
    	System.out.println("Enter amount paid so far");
        String amountOutstanding=sc.nextLine();
        
        double originalAmount1=Double.parseDouble(originalAmount);
        double amountOutstanding2=Double.parseDouble(amountOutstanding);
        double x=originalAmount1-amountOutstanding2;
        
    	System.out.println("Issue date:"+issueDate);
    	System.out.println("Due Date:"+dueDate);
    	System.out.println("Original amount Rs."+originalAmount1);
    	System.out.println("Amount outstanding Rs."+x); 	
	}
}

