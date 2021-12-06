 
public class InternationalFlight extends Flight {

	 
	private String	passportNumber;
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getNatureOfVisit() {
		return natureOfVisit;
	}
	public void setNatureOfVisit(String natureOfVisit) {
		this.natureOfVisit = natureOfVisit;
	}
	private String	natureOfVisit;
	
	InternationalFlight(String clientName , String idProof, String flightschedule,String	passportNumber,String	natureOfVisit){
	
		super(clientName,idProof,flightschedule);
		this.passportNumber=passportNumber;
		this.natureOfVisit=natureOfVisit;
		
		// TODO Auto-generated constructor stub
	
	}
	
	void displayFlightDetails() {
		
		System.out.println("Flight Details :");
        System.out.println("Name : " +this.getClientName());
		System.out.println("ID Proof :" +this.getIdProof());
		System.out.println("Flight Schedule : "+this.getFlightschedule());
		System.out.println("Passport Number : "+this.getPassportNumber());
		System.out.println("Flight Schedule: "+this.getNatureOfVisit());
		
		 

	}
}
		
		
		 
  