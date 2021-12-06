 public class HDFC extends RBI {
	
	//fill your code here
private String accountNumber;
public HDFC (String accountNumber,double creditScore,String holderName) {
	
super();
this.accountNumber=accountNumber;
this.creditScore=creditScore;
this.holderName=holderName;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public double getCreditScore() {
	return creditScore;
}
public void setCreditScore(double creditScore) {
	this.creditScore = creditScore;
}
public String getHolderName() {
	return holderName;
}
public void setHolderName(String holderName) {
	this.holderName = holderName;
}
public static double getCREDIT() {
	return CREDIT;
}
public static void setCREDIT(double cREDIT) {
	CREDIT = cREDIT;
}
private double creditScore;
private String holderName;
static double CREDIT;
 
private static DecimalFormat df = new DecimalFormat("0.00");
private static DecimalFormat df = new DecimalFormat("0.0");

}
