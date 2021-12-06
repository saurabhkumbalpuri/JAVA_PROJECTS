
 public class Payee {
	private String name;
	private String bankName;
	private String ifscCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
	private String aadharId;
	private Double amount;
	
	public Payee addPayee(String name,String bankName,String ifscCode,String aadharId, Double amount) {
		this.name=name;
		this.bankName=bankName;
		this.ifscCode=ifscCode;
		this.aadharId=aadharId;
		this.amount= amount;
		return null;
	}
		//fill your code here
	public Payee addPayee(String aadharid,String IfscCode,Double amount) {
		//fill your code here
		
		this.aadharId=aadharId;
		this.ifscCode=ifscCode; 
		this.amount= amount;
		return null;
		
		
	}
	}
	 
 
 
 
 
 
 
 
 
 
 
 