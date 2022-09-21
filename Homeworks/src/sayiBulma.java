
public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,9,0};
		int aranacak = 11;
		boolean varMi = false;
		 for(int i=0; i<sayilar.length;i++) {
			 if(aranacak==sayilar[i]) {
				 varMi=true;
				 break;
				 
			 }
		 }
		 if(varMi) {
			 System.out.println("sayı bulundu");
		 }
		 else {
			 System.out.println("sayı bulunamadı");
		 }

	}

}
