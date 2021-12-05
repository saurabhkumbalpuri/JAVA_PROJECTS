 import java.io.*;
import java.util.*;

public class UserBO{
 
	List<User> list=new ArrayList<User>();
    
    public List<User> readFromFile(BufferedReader br) throws IOException
    {
   
    	String line = br.readLine(); 
    	 String arr[] = line.split(",");
     	for(int i=0;i< arr.length;i++){
    	User user  = new User();
    	user.setName(arr[0]);
    	user.setEmail(arr[1]);
    	user.setUsername(arr[2]);
    	user.setPassword(arr[3]);
    	list.add(user);
    	}
    //Fill your code here
        return list;
    }
    public void display(List<User> list)
    {
    	for(User user : list){
      System.out.printf("%-15s %-20s %-15s %s\n",user.getName(),user.getEmail(),user.getUsername(),user.getPassword());  //Fill your code here
    }
}
}