 import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		Scanner value=new Scanner(System.in);
		HashSet a=new HashSet();
		do {
			System.out.println("Enter the username ");
			a.add(value.next());
			System.out.println("Do you want to continue?(Y/N)");
		}while(value.next().equals("Y"));
		System.out.println("The unique number of usernames is "+a.size());
	}
}