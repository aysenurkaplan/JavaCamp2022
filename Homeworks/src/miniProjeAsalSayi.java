
public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = -2;
		/*
		 * int sayac=0; 
		 * for(int i=2; i<25 ;i++) {
		 *  if(number%i == 0) { 
		 *  sayac++; 
		 *  }
		 * }
		 * if(sayac==0) { 
		 * System.out.println(number +" sayısı asaldır.");
		 *  } 
		 * else {
		 * System.out.println(number + " sayısı asal değildir.");
		 *  }
		 */

		boolean isPrime = true;
		if (number == 1) {
			System.out.println("sayi asal değildir");
			return;
		}
		if (number < 1) {
			System.out.println("geçersiz sayı girdiniz");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}
		if (isPrime) {
			System.out.println(number + " sayısı asaldır.");
		} else {
			System.out.println(number + " sayısı asal değildir.");
		}

	}

}
