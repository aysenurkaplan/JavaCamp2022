package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabaseManager();//burada stratejini belirledin.
		                                                              //configurasyon tarafı
		customerManager.getCustomers();
		
		
		CustomerManager customer2Manager = new CustomerManager();
		customer2Manager.databaseManager = new MySqlDatabaseManager();
		customer2Manager.getCustomers();

	}

}
