
 import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the client name");
        String name=sc.nextLine();
        System.out.println("Enter the id proof");
        String id=sc.nextLine();
        System.out.println("Enter the flight schedule");
        String da=sc.nextLine();
         
        System.out.println("Enter the passport number");
        String pass=sc.nextLine();
     	System.out.println("Enter the nature of visit");
        String nature=sc.nextLine();
		
		//Create reference to Flight class and assign the instance of InternationalFlight class to it
        
        
        InternationalFlight o = new  InternationalFlight(name,id,da,pass,nature);
        o.setClientName(name);
        o.setIdProof(id);
        o.setFlightschedule(da);
        o.setPassportNumber(pass);
        o. setNatureOfVisit(nature);
        o.displayFlightDetails();
        
        
        
        
        
        
        
        
        
        
        
	}
}