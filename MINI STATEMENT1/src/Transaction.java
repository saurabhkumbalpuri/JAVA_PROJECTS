
  public class Transaction {
	private String accountNumber;
	private Double amount;
	 
	 Transaction()
	 {
	 }
	 Transaction(String a, Double b)
	 {
		 accountNumber=a;
		 amount=b;
	 }
	 void setAccountNumber (String a)
	 {
		 accountNumber = a;
	}
	void setAccount(Double a)
	{
		amount = a;
	}
	Double getAmount()
	{return amount;
	}
	boolean validate (Double a)throws Exception
	{
		if(amount<=500||a> amount)
			throw new Exception ("Insuffcient Balance");
		return true;
	 }
	 }