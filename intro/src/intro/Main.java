package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		//Değişken isimlendirmeleri Java'da camelCase yazılır.
		String ortaMetin ="İlginizi Çekebilir";
		String altMetin ="Vade Süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		//int vade = 12;
		
		double dolarDun = 18.20;
		double dolarBugun =18.12;
		
		
		
		//boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu ="down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		
			
		} else {
			okYonu= "equal.svg";
			System.out.println(okYonu);

		}
		
			
		
	
	
		String[] krediler = {"kredi x","kredi c", "kredi a"};
		
		for (int i = 0; i < krediler.length; i++) 
			System.out.println(krediler[i]);
	}
}

		
		
		
	


		
	
		
	

	


