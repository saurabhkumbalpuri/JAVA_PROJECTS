
  class StageEvent extends Event {

       //your code here
	private Integer noOfShows;
	private Integer noOfSeatsPerShow;
	
	public Integer getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}
	public Integer getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}
	public void setNoOfSeatsPerShow(Integer noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	
	StageEvent(String name, String detail, String ownerName, Integer noOfShows, Integer noOfSeatsPerShow)
	{
		super(name,detail,ownerName);
		this.noOfShows=noOfShows;
		this.noOfSeatsPerShow=noOfSeatsPerShow;
	}
	
	public Double projectedRevenue()
	{
		double x=50*noOfShows*noOfSeatsPerShow;
		return x;
	}
}