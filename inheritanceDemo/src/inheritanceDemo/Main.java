package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		TarımKrediManager tarımKrediManager = new TarımKrediManager();
		tarımKrediManager.Hesapla();
		
		KrediUI krediUI =new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());

	}

}
