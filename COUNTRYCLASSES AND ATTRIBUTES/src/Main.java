 import java.io.*;
import java.util.Scanner;

    class Main extends Country{
        public static void main(String[] args) throws Exception{

            Scanner s = new Scanner(System.in);
            System.out.println("Enter the country name");
            String name = s.nextLine();
            System.out.println("Enter the country code");
            String cost = s.nextLine();
            System.out.println("Enter the isd code");
            String depo = s.nextLine();



            Country o = new Country();
            o.setName(name);
            o.setCountrycode(cost);
            o.setIsdcode(depo);

            o.display();

        }
    }