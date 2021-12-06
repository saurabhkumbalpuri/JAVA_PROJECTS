import java.util.*;
import java.io.*;
 class Main {
	 
		public static void main(String[] args) throws Exception{ 
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter branding expenses");
			double branding = sc.nextDouble();
			
			System.out.println("Enter travel expenses");
			double travel = sc.nextDouble();
			
		    System.out.println("Enter food expenses");
		    double food  = sc.nextDouble();
		    
		    System.out.println("Enter logistics expenses");
		    double logistics = sc.nextDouble();
		
		    double total = branding + travel + food + logistics ;
		
		    System.out.printf("Total expenses: Rs.%.2f\n",total);
		    
		    double a = (branding/total)*100;
		   
		    double b = (travel/total)*100;
		    double c = (food/total)*100;
		    double d = (logistics/total)*100;
		    
	    System.out.printf("Branding expenses percentage: %.2f%%\n",a);
	    System.out.printf("Travel expenses percentage: %.2f%%\n",b);
		System.out.printf("Food expenses percentage: %.2f%%\n",c);
		System.out.printf("Logistics expenses percentage: %.2f%%\n",d );
		
		
		
		
		
		
		}
	}

