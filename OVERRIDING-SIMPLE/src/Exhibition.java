 class Exhibition extends Event {
      
          //Your code here
	private Integer noOfStalls;

	public Integer getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(Integer noOfStalls) {
		this.noOfStalls = noOfStalls;
	}
	
	Exhibition(String name, String detail, String ownerName, Integer noOfStalls)
	{
		super(name,detail,ownerName);
		this.noOfStalls=noOfStalls;
	}
	
	public Double projectedRevenue()
	{
		double x=10000*noOfStalls;
		return x;
	}
}
 