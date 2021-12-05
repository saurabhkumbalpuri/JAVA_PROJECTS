
 import java.util.Scanner;

public class Main 
{
		public static void main(String[] args) 
		{
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the number of seats to be booked:");
			int noOfSeats=sc.nextInt();
			int n[] =new int[100]; 

			try 
			{

				for(int i=1;i<=noOfSeats;i++)
				{
					
					System.out.println("Enter the seat number "+i);
				int i1=sc.nextInt();
				n[i1-1]=i1;
				}	
				System.out.println("The seats booked are:");		
				for(int i=0;i<100;i++)
				{
					if(n[i]!=0)
					System.out.println(+n[i]);
				}
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);// TODO: handle exception
			}
			
			 
		
			
		}
}