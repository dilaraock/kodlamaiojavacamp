
public class MultiDimensialArrayDemo1 {

	public static void main(String[] args) {
		String[][] şehirler=new String[3][3];
		şehirler[0][0]= "Bursa";
		şehirler[0][1]= "İstanbul";
	    şehirler[0][2]= "Kocaeli";
		şehirler[1][0]= "Burdur";
		şehirler[1][1]= "Ankara";
		şehirler[1][2]= "Antalya";
		şehirler[2][0]= "Balıkesir";
		şehirler[2][1]= "Rize";
		şehirler[2][2]= "Kırklareli";
		
		for(int i=0; i<=2;i++ ) {
			System.out.println("-------");
			for(int k=0; k<=2;k++) {
				System.out.println(şehirler[i][k]);
				
			}
			
			
		}
		
		
	}

}
