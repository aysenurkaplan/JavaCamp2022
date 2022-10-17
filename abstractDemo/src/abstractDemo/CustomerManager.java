package abstractDemo;

public class CustomerManager {
	// strateji patterni 
	BaseDatabaseManager databaseManager ;
	
	public void getCustomers() {
		databaseManager.getData();
	}

}
