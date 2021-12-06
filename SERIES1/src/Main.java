 import java.util.* ;
 public class Main{
public static void main(String[] args){    	     
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int count=0, N=0,i=1,j=1;
          while(N<a)
          {
        	  j=1;
        	  count=0;
        	  while(j<=i) {
        		  if(i%j==0) {
        			  count++;
        		  }
        		  j++;
        	  }
        	  if(count==2) {
        		  System.out.printf("%d ",i);
        		  N++;
        	  }
        	  i++;
          }		  
    }
}