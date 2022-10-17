package staticDemo;

public class ProductManager {
	//ürün veritabanına ekliycek sınıf
	public void add(Product product) {
		//ProductValidator productValidator = new ProductValidator();//böyle yapmak yerine ProductValidatorün
		//isValid metod'unu static yaparız 
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi.");
		}
		else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
	}

}
