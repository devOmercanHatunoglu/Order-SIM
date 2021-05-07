package Uygulama3;
import Abstract.BaseCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new BaseCustomerManager();
		
		
		baseCustomerManager.Save(new Customer(1,"Engin","Demiroð",25,"123"));
		
		
		
		
		
	}

}
