
public class stringsDemo {

	public static void main(String[] args) {
		String metin = "Bugün hava çok güzel.";
		System.out.println(metin);

		/*
		 * System.out.println("Eleman sayısı:" + metin.length());
		 * System.out.println("5. eleman:"+ metin.charAt(4));
		 * System.out.println(metin.concat(" Yaşasın!"));
		 * System.out.println(metin.startsWith("B"));
		 * System.out.println(metin.endsWith(".")); char[] karakterler = new char[5];
		 * metin.getChars(0, 5, karakterler, 0); System.out.println(karakterler);
		 * System.out.println(metin.indexOf("av"));
		 * System.out.println(metin.lastIndexOf("a"));
		 */

		String yeniMetin = metin.replace(" ", "-");
		System.out.println(yeniMetin);
		System.out.println(metin.substring(2));
		System.out.println(metin.substring(2, 5));

		for (String kelime : metin.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());
		System.out.println(metin.trim());

	}

}
