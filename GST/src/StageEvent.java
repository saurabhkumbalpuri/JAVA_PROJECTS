 class StageEvent extends Event {

	// Fill your code here
	private static Integer	gst = 15;
	private Integer	noOfSeats;
	
	public static Integer getGst() {
		return gst;
	}

	public static void setGst(Integer gst) {
		StageEvent.gst = gst;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public StageEvent(String name, String type, Double costPerDay, Integer noOfDays, Integer noOfSeats)
	{
		super(name,type,costPerDay,noOfDays);
		this.noOfSeats=noOfSeats;
	}

	public Double totalCost() {

		// Fill your code here
		double x=(noOfDays*costPerDay*gst)/100;
		double totalamount=(costPerDay*noOfDays)+x;
        return totalamount ;
		
	}

	@Override
	public String toString() {
		// Fill your code here
		String s2=String.format("Total amount:%.2f",totalCost());
		return  "Event Details\nName:"+this.name+"\nType:"+this.type+"\nNumber of seats:"+this.noOfSeats+"\n"+s2;
	}
}
