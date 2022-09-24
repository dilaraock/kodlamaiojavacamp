import javax.swing.plaf.synth.SynthStyleFactory;

public class MükemmelSayılar {

	public static void main(String[] args) {
		int n = -1;
		int m = 0;
		if (n <= 1) {
			System.out.println("Geçersiz sayı");
			return;
		}

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				m = m + i;
			}
		}
		if (m == n) {
			System.out.println("Mükemmel sayıdır.");

		} else {
			System.out.println("Mükemmel sayı değildir.");
		}

	}
}
