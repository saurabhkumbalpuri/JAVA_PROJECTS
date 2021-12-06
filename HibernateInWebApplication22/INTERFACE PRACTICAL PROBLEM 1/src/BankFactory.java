
 public class BankFactory {
	
     //	Fill your code
	public ICICI getIcici()
	{
		return new ICICI();
	}
	public HDFC getHdfc()
	{
		return new HDFC();
	}
}