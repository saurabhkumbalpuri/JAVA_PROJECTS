
public class T20 extends Match{
	
	public T20(int score,float over,int target)
	{
		super.currentScore=score;
		super.currentOver=over;
		super.target=target;
	
	}
	int calculateBalls()
	{
		String s=new Float(super.currentOver).toString();
		String p= s.substring(s.indexOf('.') + 1,s.length() );
		int balls=Integer.parseInt(p);
		balls=120-(balls+((int)super.currentOver*6));
		return balls;
		
	}
	float calculateRunrate()
	{
		int balls=this.calculateBalls();
		 float rr=((super.target-super.currentScore)/(float)(balls)*6);
		 rr = Float.parseFloat(String.format("%.3f",rr));
		 return rr;
	}
	 
}
