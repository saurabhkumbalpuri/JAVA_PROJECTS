 import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class Main
{
    public static void main(String[] args) throws IOException 
    {
    	File file = new File("input.csv");
       BufferedReader  br = new BufferedReader (new FileReader(file));
        UserBO obj1 = new UserBO();
         obj1.readFromFile(br);
         List<User> list = new ArrayList<User>();
         list = obj1.readFromFile(br);
         obj1.display(list);
         
     
         
    }
}