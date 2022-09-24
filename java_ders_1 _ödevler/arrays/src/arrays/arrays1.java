package arrays;

public class arrays1 {

	public static void main(String[] args) {
		String ogrenci1="Özgür";
		String ogrenci2="Sabri";
		String ogrenci3="Ekrem";
		String ogrenci4="Tayfun";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		System.out.println("-----------------");
		
		String[] ogrenciler=new String[4];
		ogrenciler[0]="Özgür";
		ogrenciler[1]="Sabri";		
		ogrenciler[2]="Ekrem";
		ogrenciler[3]="Tayfun";		
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
			}
		System.out.println("----------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
	}

}
