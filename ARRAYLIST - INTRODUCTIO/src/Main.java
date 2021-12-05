
 import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner value=new Scanner(System.in);
		ArrayList a=new ArrayList();
		int j=1;
		do {
			System.out.println("Enter the username "+j);
			j=j+1;
			a.add(value.next());
			System.out.println("Do you want to continue?(y/n)");
		}while(value.next().equals("y"));
		
		int b=a.size();
		System.out.println("The Names entered are:");
		for(int i=0;i<b;i++) {
			
			System.out.println(a.get(i));
		}
		
	}
}