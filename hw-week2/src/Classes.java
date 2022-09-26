
public class Classes {

	public static void main(String[] args) {
		// reference type
		CustomerManager customerManager = new CustomerManager();

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		CustomerManager customerManager2 = new CustomerManager();

		customerManager2.Add();
		customerManager2.Remove();
		customerManager2.Update();

		// value type

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		// Reference type

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
		
		
	DortIslem dortIslem = new DortIslem();
	 int sonuc=dortIslem.Topla(7, 9);
	 System.out.println(sonuc);
	}

}
