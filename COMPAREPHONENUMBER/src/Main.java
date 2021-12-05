
 import java.io.*;
import java.util.Scanner;	
public class Main{
	public static long n;
	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=value.nextLine();
		System.out.println("Enter UserName");
		String username=value.nextLine();
		System.out.println("Enter Password");
		String password=value.nextLine();
		System.out.println("Enter PhoneNumber");
		long phonenumber=value.nextLong();
		
		System.out.println("Enter Name");
	    String na=value.next();
		System.out.println("Enter UserName");
		String un=value.next();
		System.out.println("Enter Password");
		String pass=value.next();
		System.out.println("Enter PhoneNumber");
		long ph=value.nextLong();
		
		User user=new User(name,username,password,phonenumber);
		User user1=new User();
		
		user.setName(name);
		user.setUsername(username);
		user.setPassword(password);
		user.setPhoneNumber(phonenumber);
		//n=user.getPhoneNumber();
		
		user1.setName(na);
		user1.setUsername(un);
		user1.setPassword(pass);
		user1.setPhoneNumber(ph);
		boolean d;
		//User c=new User();
		d=user1.comparePhoneNumber(user);
		if (d == true) {
			System.out.println("Same Users");
		}
		else {
			System.out.println("Different Users");
		}
		
}
}