package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
		womenGameCalculator.hesapla();
		womenGameCalculator.gameOver();

		// absract sınıflar new lenemezler newlemek için onun operasyonlarını ezmek
		// gerekir
		// mainde ama bunu kullanmayız çirkin bir kullanım her newlediğimizde içini mi
		// doldurucaz
		//referans tutucu ve kuralları içeren görevi görüyor
		GameCalculator gameCalculator = new KidsGameCalculator();
		gameCalculator.hesapla();

	}

}
