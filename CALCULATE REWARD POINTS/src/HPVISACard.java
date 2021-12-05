 class HPVISACard extends VISACard{
    public Double computeRewardPoints(String type, Double amount){
		double total = super.computeRewardPoints(type,amount);
		if(type.equalsIgnoreCase("Fuel")) {
			total = total + 10;
			return total;
		}else {
			return total;
		}
     
    }
}