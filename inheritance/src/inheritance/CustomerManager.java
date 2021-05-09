package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + "Kaydedildi");
	}
	
	public void addMultiplt(Customer[] customers) {
		for(Customer customer : customers){
			add(customer);
		}		
	}

}
