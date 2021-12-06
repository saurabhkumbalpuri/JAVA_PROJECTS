import java.sql.Date;

public class Flight {

	protected String clientName;
	protected String	idProof;
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public String getFlightschedule() {
		return flightschedule;
	}
	public void setFlightschedule(String flightschedule) {
		this.flightschedule = flightschedule;
	}
	protected String	flightschedule;

	Flight( String clientName , String idProof,String flightschedule  ) {
		this.clientName=clientName ;
		this. idProof= idProof;
		this.flightschedule = flightschedule ;
		 
	
	}
	

		 
		

}
