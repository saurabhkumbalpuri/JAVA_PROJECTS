 public class ItemType  {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	double costPerDay , deposit;
	
	public void display(){
		System.out.println("Item type details");
		
		
		System.out.println("Name:" +this.getName());

		
		System.out.printf("CostPerDay:%.2f\n" ,this.getCostPerDay());
		

		
		System.out.printf("Deposit:%.2f" ,this.getDeposit());

			
	}
}