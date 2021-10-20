package mypackage;

public class Application {
	
	public static void main(String[] args) {
		
		int zahl = 5;
		char buchstabe = 'A';
		
		//String ist ein Sonderfall. Kein primitiver Datentyp
		String zeichenkette = "Aasdfsdfg";
		System.out.println(zeichenkette.toUpperCase());
		
		System.out.println(zahl + "Hallo Welt" + buchstabe);
		
		
		float komma = 5.5f;
		double kommaGroﬂ = 5.5d;
		
		
		long groﬂeZahl = 6546468548964654685L;
		short kleineZahl = 5;
		byte b = 127;
		
		
		boolean wahr = true;
		boolean falsch = false;
		
		System.out.println(wahr);
	}
}
