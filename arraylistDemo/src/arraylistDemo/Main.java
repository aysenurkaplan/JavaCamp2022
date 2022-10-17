package arraylistDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();
		
		sayilar.add(18);
		sayilar.add("C18");
		sayilar.add("sayilar");
		
		//System.out.println(sayilar.size());
		
		//System.out.println(sayilar.set(2,"ankara"));
		System.out.println(sayilar.get(2));
		
		sayilar.remove(0);
		sayilar.clear();
		
		for(Object i:sayilar) {
			System.out.println(i);
		}

	}

}
