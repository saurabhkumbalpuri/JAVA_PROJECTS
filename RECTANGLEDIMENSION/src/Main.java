  import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception, IOException {
			

		//Fill your code
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the length of the rectangle");
    	int length=sc.nextInt();
    	System.out.println("Enter the width of the rectangle");
    	int width=sc.nextInt();
    	
    	Rectangle o1=new Rectangle(length,width);
    	o1.setLength(length);
    	o1.setWidth(width);
    	o1.display();
    	System.out.println("Area of the Rectangle:"+o1.area());
    	System.out.println("Enter the new dimension");
    	int newDimension=sc.nextInt();
    	//Rectangle o2=new Rectangle(length,width);
    	boolean x=o1 instanceof Rectangle;
    	Rectangle o2=o1.dimensionChange(newDimension);
    	o2.display();
    	
    	System.out.println("Area of the Rectangle:"+o2.area());
    	
    	
  }
}