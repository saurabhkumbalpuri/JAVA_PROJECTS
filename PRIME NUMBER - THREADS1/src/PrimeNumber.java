 
import java.awt.print.Book;

public class PrimeNumber implements Runnable {
	public int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}	
	public void run() {
		int j,i;
		 
		try {
			for( i=1;i<number;i++)
			{ 
				for(j=2;j<=i;j++) {
					if(i%j==0) {
						if(i==j) {
				
							System.out.print(i+" ");
						}
						
							else {
								break;
							}
						
					}
						
						
				}
			}
			
				
	          
		}catch(Exception e) {
			
		}
	
		
		
	}
}