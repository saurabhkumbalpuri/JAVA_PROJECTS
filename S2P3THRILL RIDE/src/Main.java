
 import java.util.*;
public class Main{
public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
		int age = sc.nextInt();
		if(age<15)
		{
			System.out.println("Not Allowed");
		}
		else if (age>60)
		{
			System.out.println("Not Allowed");
		}
		else
		{
			System.out.println("Allowed");
		}
	}
}