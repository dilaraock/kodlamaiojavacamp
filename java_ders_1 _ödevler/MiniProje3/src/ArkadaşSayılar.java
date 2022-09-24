
public class ArkadaşSayılar {

	public static void main(String[] args) {
		int a = 220;
		int b = 284;
		int t1 = 0;
		int t2 = 0;

		for (int x = 1; x < a; x++) {
			if (a % x == 0) {
				t1 = t1 + x;

			}
		}
		for (int  y= 1; y < b; y++) {
			if (b % y == 0) {
				t2 = t2 + y;
			}
		}if(b==t1 && a==t2) {
			System.out.println("Arkadaş sayılardır.");
			
		}else {
			System.out.println("arkadaş sayılar değillerdir.");
		}
	}

}
