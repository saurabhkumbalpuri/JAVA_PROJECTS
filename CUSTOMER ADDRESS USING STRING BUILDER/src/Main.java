
  import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main extends Address {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Address Details :");
		System.out.println("Enter Line 1 :");
		String a = sc.nextLine();
		System.out.println("Enter Line 2 :");
		String b = sc.nextLine();
		System.out.println("Enter City :");
		String c = sc.nextLine();
		System.out.println("Enter Country :");
		String d = sc.nextLine();
		System.out.println("Enter Zip Code :");
		int e = sc.nextInt();

		Address add = new Address();
		add.setLine1(a);
		add.setLine2(b);
		add.setCity(c);
		add.setCountry(d);
		add.setZipCode(e);
		add.toString();
		StringBuilder sb = new StringBuilder();
		sb.append(add.toString());
		System.out.println(sb.toString());

	}

}