
 import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n :");
		int n = sc.nextInt();
		System.out.println("Enter numbers : ");
		String a[] = new String[n];
		int[] arr;
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter strings : ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();

		}
		System.out.println("Displaying numbers");
		for (int var : arr) {
			System.out.println(var);
		}
		System.out.println("Displaying strings");
		for (String str : a) {
			System.out.println(str);
		}

	}
}