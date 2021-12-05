
 public class StageEvent extends Event {
    
    //Fill your code here
	private Integer noOfShows;
	private Double costPerShow;
	
	public Integer getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}

	public Double getCostPerShow() {
		return costPerShow;
	}

	public void setCostPerShow(Double costPerShow) {
		this.costPerShow = costPerShow;
	}

	public StageEvent(String name, String detail, String type, String organiser, Integer noOfShows,Double costPerShow)
	{
		super(name,detail,type,organiser);
		this.noOfShows=noOfShows;
		this.costPerShow=costPerShow;
	}

	Double calculateAmount() {

        //Fill your code here
		double x=noOfShows*costPerShow;
        return x;

    }  
	
}