
  import java.io.*; 
import java.util.*; 
public class Main{ 
	public static void main (String[] args) throws Exception{ 

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first string : ");
			String str1 = sc.nextLine();
			System.out.println("Enter the second string : ");
			String str2 = sc.nextLine();
			
			 int count = 0;    
	            for(int i = 0; i < str1.length(); i++) {    
		           
		                count++;    
		        }    
		         System.out.print("Substring : ");  
		         System.out.println(str1.substring(3, count));
		         System.out.println("The character at 3rd position in the second string is : "+ str2.charAt(3));
	             System.out.println("Are string 1 and string 2 equal? : "+str1.equalsIgnoreCase(str2));
	             System.out.println("Concatenated string : "+str1+str2);
	
	
	} 
}