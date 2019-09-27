public class SzuloGyerek {
	public static void main (String args[]) {
		Szulo sz = new Szulo();
		Szulo gy = new Gyerek();

		sz.szuloUzen();
		gy.gyerekUzen();
	}
}

public class Szulo {
	public void szuloUzen() {
		System.out.println("Szulo uzen.");
	}
}

public class Gyerek {
	public void gyerekUzen() {
	System.out.println("Gyerek uzen.");
	}
}