
import java.util.Scanner;
 


public class Main{
	 public static void main (String [] args) {
		 int i;
		 System.out.println(" Arguments :");
		 Scanner sc = new Scanner(System.in);
			String o = sc.nextLine();
		 for(i=1;i<args.length;i++) {
			 System.out.println(args[i]);
			 
		 }
		 System.out.println("The number of arguments is " + (i*i));
		 }
	 }
 