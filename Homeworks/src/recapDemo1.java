
public class recapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 1;
		int sayi2 = 63;
		int sayi3 = 12;
		int enBuyukSayi;
		enBuyukSayi = sayi1;
		if(sayi2>enBuyukSayi) {
			enBuyukSayi=sayi2;
		}
		else{
			if(sayi3>enBuyukSayi) {
				enBuyukSayi = sayi3;
			}
		}
    System.out.println("En büyük sayı:"+enBuyukSayi);
	}

}
