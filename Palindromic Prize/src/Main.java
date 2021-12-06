import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int i=0,n=0,m,temp;
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		m =a;
		if (a<100) {
			System.out.println("no");
			
		}else {
		
		while(a>0) {
			temp=a%10;
			n=(n*10)+temp;
			a=a/10;
			
		}
			
		if(n==m) {
			
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		//fill your code here
	}

}
}
