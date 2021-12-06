 import java.util.Scanner;
import java.io.*;
 public class Main {


    public static void main(String[] args) throws Exception{

        System.out.println("Enter the first string : " );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Enter the second string : " );
        String na = sc.nextLine();
        System.out.println("Substring : "   +name.substring(3));
        System.out.println("The character at 3rd position in the second string is : "   +na.substring(3,4));
        System.out.println("Are string 1 and string 2 equal? : "
                + name.equalsIgnoreCase(na));
        String s3=name.concat(na);
        System.out.println("Concatenated string : "+s3);

    }

}