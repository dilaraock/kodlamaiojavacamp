
public class inceKalın {

	public static void main(String[] args) {
		char L = 'r';

		switch (L) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("Kalın sesli harftir.");
			break;
		default:
			switch (L) {
		case 'e':
		case 'E':
		case 'İ':
		case 'i':
		case 'ü':
		case 'Ü':
		case 'ö':
		case 'Ö':
			System.out.println("İnce sesli harftir.");
			break;
		default:
			System.out.println("Geçersiz harf");
			}}

	}

}
