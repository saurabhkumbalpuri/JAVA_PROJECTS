
 public class ICICI extends RBI {
	
	//fill your code here
private String accountNumber;
private String holderName;
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getHolderName() {
	return holderName;
}
public void setHolderName(String holderName) {
	this.holderName = holderName;
}
public double getCreditScore() {
	return creditScore;
}
public void setCreditScore(double creditScore) {
	this.creditScore = creditScore;
}
public double getCREDIT() {
	return CREDIT;
}
public void setCREDIT(double cREDIT) {
	CREDIT = cREDIT;
}
private double creditScore;
static double CREDIT;
public ICICI(String accountNumber,String holderName,double creditScore,String holderName1 ) {
	
	super();
	this.accountNumber=accountNumber;
	 
	this.creditScore=creditScore;
	this.holderName=holderName1;
}
private static DecimalFormat df = new DecimalFormat("0.00");
private static DecimalFormat df = new DecimalFormat("0.0");


public double calculateCreditScore(double amount) {
	CREDIT = amount/10;
	creditScore =creditScore + CREDIT;
	return creditScore;
	
	
	public void display() {
		System.out.println("Amount paid Succesfully!!!");
		System.out.println("hi,"+this.getHolderName());
		System.out.println("you have gained"+df.format(CREDIT )+"CREDIT score for the payment of "+ dg. formate(CREDIT*10));
		
		System.out.println("your Total credit score is " + df.format (getcreditScore());
	
}

	 
}
