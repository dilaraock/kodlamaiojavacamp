
public class AsalSayıBulma {

	public static void main(String[] args) {
		int n = 19;
		boolean asalMı = true;
		if(n==1) {
			System.out.println("Sayı asal değildir.");
		return;}
		if(n<1) {
			System.out.println("Geçersiz sayı.");
		return;}
		for (int x = 2; x < n; x++) {
			if (n % x == 0) {
				asalMı = false;
			}
		}
		if (asalMı) {
			System.out.println("Sayı asaldır.");
		} else {
			System.out.println("Sayı asal değildir.");
		}

	}

}
