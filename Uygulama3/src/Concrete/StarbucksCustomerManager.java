package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.PersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
		
		private PersonCheckService _personCheckService;
		public StarbucksCustomerManager(PersonCheckService _personCheckService) {
			this._personCheckService = _personCheckService;
		}
		@Override
		public void Save(Customer customer) {
			
			if (_personCheckService.CheckIfRealPerson(customer)) {
				
				System.out.println("Starbucks Veritabanýna Kaydedildi." + customer.getFirstName());
			}
			else {
				System.out.println("Geçerli Kiþi Deðil.");
			}
			
		}

	
		
		
}
