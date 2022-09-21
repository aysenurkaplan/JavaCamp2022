
public class mukemmelSayi {

	public static void main(String[] args) {
		int number = 28;
		int toplam=0;
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				toplam+=i;
			}
		}
		if(number==toplam) {
			System.out.println("sayı mükemmel sayıdır");
		}
		else {
			System.out.println("sayı mükemmel sayı değildir");
		}

	}

}
