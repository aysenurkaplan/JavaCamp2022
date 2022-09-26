
public class Methods {

	public static void main(String[] args) {
		
	sayiBulma();

	}
    
	public static void sayiBulma() {
		int[] sayilar = new int[] {1,2,5,9,0};
		int aranacak = 8;
		boolean varMi = false;
		 for(int i=0; i<sayilar.length;i++) {
			 if(aranacak==sayilar[i]) {
				 varMi=true;
				 break;
				 
			 }
		 }
		 String mesaj="";
		 if(varMi) {
			 mesaj = "Sayı mevcuttur :" + aranacak; 
			 mesajVer(mesaj);
		 }
		 else {
			 mesajVer("Sayı mevcut değildir :" + aranacak);
		 }
		 
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
