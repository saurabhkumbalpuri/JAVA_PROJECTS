
 
	 import java.util.Scanner;
	 public class Main {
		public static void main (String[] args) throws Exception{
			
			System.out.println("Enter the first string : " );
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			System.out.println("Replaced 'a' with 'z' : " + name.replace('a','z'));
			System.out.println("After trimming : " + name.trim());
			
			
			
		}
	}


