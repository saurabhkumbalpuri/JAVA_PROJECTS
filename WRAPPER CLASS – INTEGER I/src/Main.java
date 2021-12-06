
 import java.util.*;
public class Main
{
	public static void main(String[] args) throws Exception 
	{
		//Your code here
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=sc.nextInt();
		String binaryobj=Integer.toBinaryString(n);
		String hexobj=Integer.toHexString(n);
		String octobj=Integer.toOctalString(n);
		Byte byteobj=((byte) n);
		Long longobj=(long)n;
		Short shortobj=(short)n;
		Float floatobj=(float)n;
		Double doubleobj=(double)n;
		
		System.out.println("The binary equivalent of "+n+" is "+binaryobj);
		System.out.println("The hexadecimal equivalent of "+n+" is "+hexobj);
		System.out.println("The octal equivalent of "+n+" is "+octobj);
		System.out.println("Byte value of "+n+" is "+byteobj);
		System.out.println("Short value of "+n+" is "+shortobj);
		System.out.println("Long value of "+n+" is "+longobj);
		System.out.println("Float value of "+n+" is "+floatobj);
		System.out.println("Double value of "+n+" is "+doubleobj);
    }
}