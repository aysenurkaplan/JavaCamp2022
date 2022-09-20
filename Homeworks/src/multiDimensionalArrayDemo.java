
public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String sehirler[][]=new String[3][3];
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="İzmir";
		sehirler[0][2]="Bursa";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Bolu";
		sehirler[1][2]="Diyarbakır";
		sehirler[2][0]="Erzurum";
		sehirler[2][1]="Sivas";
		sehirler[2][2]="Çanakkale";
		
		for(int i=0; i<3; i++) {
			System.out.println("--------------");
			for(int j=0; j<3; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		

	}

}
