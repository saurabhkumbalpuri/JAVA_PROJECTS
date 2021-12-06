import java.util.Scanner;

public class Main {

	 public static void main (String [] args) {
		  

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string");
		 String a= sc.next();
		 System.out.println("Enter the start string");
		 String b= sc.next();
		 String str1='\u0022'+a+'\u0022';
		 String str2='\u0022'+b+'\u0022';
		 
		 if (a.startsWith(b)) {  
			 System.out.println(str1+"starts with"+str2); 
			 } 
		 
		 else {
			 System.out.println(str1+"does not start with"+str2);
		 }
		 
		 
		
	}

	 }

