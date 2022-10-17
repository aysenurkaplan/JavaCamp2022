package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {new TarımKrediManager(),
				new OgretmenKrediManager(), new OgrenciKrediManager()};
		for(BaseKrediManager krediler: baseKrediManagers) {
			System.out.println(krediler.hesapla(1000));
		}

	}

}
