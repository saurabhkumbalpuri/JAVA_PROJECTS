 import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
	System.out.println("Enter a string to reverse");

Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
StringBuilder sb = new StringBuilder();
//System.out.println("Enter a string to reverse");


//Appending the characters in the reverse order
for(int i = str.length() - 1; i >= 0; i--)
{
sb.append(str.charAt(i));
}
System.out.println("Reverse of the string is "+sb.toString());
//System.out.println(sb.toString());
//System.out.println("Reverse of the string is");
}
}