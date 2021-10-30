package ec.edu.espol.workshops;

public class Insurance {

	private int basePremium = 500;
	protected Customer customer;
	protected int premium;
	
	public Insurance(Customer customer) {
		this.customer = customer;
		this.premium = basePremium;
			
	}
	
	public int calculateInsure() {
		if(customer.getAge() > 80 || customer.getDriverLicense()== false) {
			this.premium= -1;
			return premium;
		}
		if(customer.getAge()> 45 && customer.getAge()< 65) {
			this.premium-= 100;
		}
		if(customer.getSex() == "M" && customer.getisMarried() == false && customer.getAge() < 25) {
			this.premium += 1500;
		}
		if(customer.getSex() == "F" || customer.getisMarried()==true) {
			this.premium -= 200;
		}
		return premium;
	}
	
	public int getPremium() {
		return premium;
	}



	


}
