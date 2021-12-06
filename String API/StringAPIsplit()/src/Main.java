
 import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
		// fill your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String line=sc.nextLine();
        String[] str = line.split(" ");
        System.out.println("The words in the string are");
        for(String a:str)
        System.out.println(a);
	}
}