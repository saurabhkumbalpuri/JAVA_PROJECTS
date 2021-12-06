
 import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  {
		// fill your code here
    	Scanner sc=new Scanner(System.in);
    	//String url = "https://howtodoinjava.com/java-initerview-questions";
    	 String str=sc.nextLine();
    	// String[] arrOfStr = str.split("str", 0);
    	 StringTokenizer multiTokenizer = new StringTokenizer(str,";");
    	 
    	while (multiTokenizer.hasMoreTokens())
    	{
    	    System.out.println(multiTokenizer.nextToken().replace('=',' '));
    	   
    	}
	}

}
//String str = "geekss@for@geekss";
//String[] arrOfStr = str.split("s", 0);
//title=Java-Samples;author=Emiley J;publisher=java-samples.com;copyright=2007;



//Sample Output:
//title Java-Samples
//author Emiley J
//publisher java-samples.com
//copyright 2007