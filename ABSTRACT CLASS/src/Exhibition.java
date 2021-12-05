
 public class Exhibition extends Event {
 
    //Fill your code here
	private Integer noOfStalls;
	private Double rentPerStall;

	
    public Integer getNoOfStalls() {
		return noOfStalls;
	}


	public void setNoOfStalls(Integer noOfStalls) {
		this.noOfStalls = noOfStalls;
	}


	public Double getRentPerStall() {
		return rentPerStall;
	}


	public void setRentPerStall(Double rentPerStall) {
		this.rentPerStall = rentPerStall;
	}
	
	public Exhibition(String name, String detail, String type, String organiser, Integer noOfStalls,Double rentPerStall)
	{
		super(name,detail,type,organiser);
		this.noOfStalls=noOfStalls;
		this.rentPerStall=rentPerStall;
	}

	Double calculateAmount() {

        //Fill your code here
		double x=noOfStalls*rentPerStall;
		return x;
    }
     	
}