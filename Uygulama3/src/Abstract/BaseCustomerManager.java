package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {
	
		@Override
		public void Save(Customer customer) {
			
			System.out.println("Veritaban�na Kaydedildi." + customer.getId() +" "+ customer.getFirstName() +" "+ customer.getLastName());
		}

		
}
