 
 import java.util.*; 
 public class Main {

	public static void main(String[] args) {
		int sub1, sub2, sub3, sub4, sub5;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject 1 mark");
		sub1 = sc.nextInt();
		System.out.println("Enter the subject 2 mark");
		sub2 = sc.nextInt();
		System.out.println("Enter the subject 3 mark");
		sub3 = sc.nextInt();
		System.out.println("Enter the subject 4 mark");
		sub4 = sc.nextInt();
		System.out.println("Enter the subject 5 mark");
		sub5 = sc.nextInt();
		if(sub1==5||sub2==5||sub3==5||sub4==5||sub5==5)
		{
			if(sub1==2 || sub2==2 || sub3==2 || sub4==2 || sub5==2)
			{
				System.out.println("No");
			}
			else if((sub1+sub2+sub3+sub4+sub5)/5.0>=4.0)
            System.out.println("Yes");
            else
            	System.out.println("No");
		}
			
		else
			System.out.println("No");
	}

}
