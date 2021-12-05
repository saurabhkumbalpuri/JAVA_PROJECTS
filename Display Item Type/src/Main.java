

import java.io.*;
 import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;


  class ItemType  {
	
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

	 private double costPerDay , deposit;
	
	public void display(){
		System.out.println("Item type details");
		
		
		System.out.println("Name:" +this.getName());

		
		System.out.printf("CostPerDay:%.2f" ,this.getCostPerDay());
		System.out.println(" ");

		
		System.out.printf("Deposit:%.2f" ,this.getDeposit());

			
	}
}
  

 class Main extends ItemType{
 	public static void main(String[] args) throws Exception{ 
 		
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the item type name");
 String name = s.nextLine();
 System.out.println("Enter the cost per day");
 double cost = s.nextDouble();
 System.out.println("Enter the deposit");
 
 double depo = s.nextDouble();



 ItemType o = new ItemType();
 o.setName(name);
 o.setCostPerDay(cost);
 o.setDeposit(depo);

 	 o.display();
 	 
 	}
 }