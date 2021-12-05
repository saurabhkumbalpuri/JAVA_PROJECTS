 
class Exhibition extends Event {

	// Fill your code here
	private static Integer	gst = 5;
	private Integer	noOfStalls;
	
	
	

	public static Integer getGst() {
		return gst;
	}

	public static void setGst(Integer gst) {
		Exhibition.gst = gst;
	}

	public Integer getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(Integer noOfStalls) {
		this.noOfStalls = noOfStalls;
	}
	
	public Exhibition(String name, String type, Double costPerDay, Integer noOfDays, Integer noOfStalls)
	{
		super(name,type,costPerDay,noOfDays);
		this.noOfStalls=noOfStalls;
	}

	public Double totalCost() {

      //Fill your code here
		
		double x=(noOfDays*costPerDay*gst)/100;
		double totalamount=(costPerDay*noOfDays)+x;
       return totalamount ;
    }

	@Override
	public String toString() {
		// Fill your code here
		String s1=String.format("Total amount:%.2f",totalCost());
		return "Event Details\nName:"+this.name+"\nType:"+this.type+"\nNumber of stalls:"+this.noOfStalls+"\n"+s1;
	}
}