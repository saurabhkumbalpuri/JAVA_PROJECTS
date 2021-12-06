  
 class SavingsAccount implements MaintainanceCharge {
	//fill the code
	final float m=50;
	public Float calculateMaintanceCharge(Float noOfYears)
	{
		float x=(2*m*noOfYears)+50;
		return x;
	}
}