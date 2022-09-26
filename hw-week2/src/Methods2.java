
public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String baskaMesaj = mesaj.substring(0,2);
		System.out.println(baskaMesaj);
		System.out.println(mesaj);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int toplam = topla(5,3);
		System.out.println(toplam);
		int toplam2 = topla2(2,3,4,5,6);
		System.out.println(toplam2);
		
		}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1 , int sayi2) {
		return sayi1 + sayi2 ;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam ;
		
	}

}
