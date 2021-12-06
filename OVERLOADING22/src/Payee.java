
public class Payee {
	private String name;
	private String bankname;
	private String ifscCode;
	private String aadharId;
	private Double amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Payee addPayee(String name, String bankname, String ifscCode, Double amount) {
		 if(this.name.equals(name)&&this.bankname.equals(bankname)&& this.ifscCode.equals(ifscCode))
		 {
			 Double depositeAmount;
			 this.amount=this.amount+depositeAmount;
			 return this;
		 }
		 else
		 {
			 return null;}
	}
	
		 

	}
public Payee addPayee(String name, String bankname, String ifscCode, Double deposite amount) {
	if(this.name.equals(name)&&this.bankname.equals(bankname)&& this.ifscCode.equals(ifscCode))
	{
		this.amount=this.amount+depositeAmount;
		 return this;
	}
	 else
	 {
		 return null;}
}
	
}
	 
	
	 