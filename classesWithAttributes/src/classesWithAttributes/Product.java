package classesWithAttributes;


public class Product {
	
	public Product(int id,String name, String description, double price, int stackAmount ) {
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stackAmount;
		
		System.out.println("Yapıcı Blok Çalıştı.");
	}
	
	public Product(){
		System.out.println("overloading constructor çalıştı.");
	}
	
	
	
	// attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id; //_ best practise onun yerine this.id=id de yazılabilir.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getKod() {
		return this.name.substring(0,1) + id ;
	}

	
	
	
	
	

}
