package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't Repeat Yourself
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		// TODO Auto-generated method stub
		System.out.println(internetSubeButonu);
		
		if(dolarBugun < dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}else if(dolarBugun < dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}else {
			System.out.println("Dolar e�ittir resmi");
		}

		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Komut Kredisi";
		String kredi4 = "�ift�i Kredisi";
		String kredi5 = "MSB kredisi";
		String kredi6 = "MEB Kredisi";
		String kredi7 = "K�lt�r Bakanl��� Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		//HTML i�eri�inde de kredi7 eklenmeli
		
		String[] krediler =
			{
					"H�zl� Kredi",
					"Mutlu Emekli Kredisi",
					"Komut Kredisi",
					"�ift�i Kredisi",
					"MSB kredisi",
					"MEB Kredisi",
					"K�lt�r Bakanl��� Kredisi"
			};
		
		//foreach
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
	}

}
