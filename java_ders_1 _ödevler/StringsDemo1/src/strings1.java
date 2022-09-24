
public class strings1 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava yağmurlu.";

		System.out.println(mesaj);
		System.out.println("Eleman Sayısı=" + mesaj.length());
		System.out.println("7. Eleman=" + mesaj.charAt(6));

		System.out.println(mesaj.concat("Tüh!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("ğ"));
		System.out.println(mesaj.lastIndexOf("a"));

		String yeniMesaj = mesaj.replace("ğ", "g").replace("ü", "u");

		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(8, 14));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);

		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
//System.out.println(mesaj.trim()); kodu başındaki ve sonundaki boşlukları siler.
	}

}
