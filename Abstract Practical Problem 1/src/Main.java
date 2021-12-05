
import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n,score,target;
	float overs;
	System.out.println("Enter the Cricket Format\n1.ODI\n2.T20\n3.Test");
	n=sc.nextInt();
	
	if(n<1||n>3)
	{
		System.out.println("Invalid Format type");
		System.exit(0);
	}
	System.out.println("Enter the Current Score");
	score=sc.nextInt();
	
	System.out.println("Enter the Current over");
	overs=sc.nextFloat();
	
	System.out.println("Enter the Target");
	target=sc.nextInt();
	
	int balls=0;
	float rr=0;
	switch(n)
	{
	case 1:
		ODI obj=new ODI(score,overs,target);
		balls=obj.calculateBalls();
		rr=obj.calculateRunrate();
		break;
		
	case 2:
		T20 obj1=new T20(score,overs,target);
		balls=obj1.calculateBalls();
		rr=obj1.calculateRunrate();
		break;
		
	case 3:
		Test obj2=new Test(score,overs,target);
		balls=obj2.calculateBalls();
		rr=obj2.calculateRunrate();
		break;
		
	}
	System.out.println("Requirements:");
	if(balls==1&&(target-score)>1)
	{
		System.out.println("Need "+(target-score)+" Runs in "+balls+" ball");
	}
	else if((target-score)==1 && balls >1)
	{
		System.out.println("Need "+(target-score)+" Run in "+balls+" ball");
	}
	else if (balls==1&&(target-score)==1)
	{
		System.out.println("Need "+(target-score)+" Run in "+balls+" ball");
	}
	else
	{
		System.out.println("Need "+(target-score)+" Runs in "+balls+" balls");
	}
	
	System.out.printf("Require Run Rate - %.2f" , rr);
	
	
	
	
	}
}

 



