package refactoring;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class GestorLloguersLite {

	public static void main(String[] args) throws ParseException {
		Client c = new Client("3454545","Eduard","45454545");

		Vehicle v1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		Date date = dateFormat.parse("2/8/2013");
		Lloguer ll1 = new Lloguer(date, 2, v1);
		c.afegeix(ll1);		

		Vehicle v2 = new Vehicle("Hyundai", "Atos", Vehicle.LUXE);
		date = dateFormat.parse("2/10/2017");
		Lloguer ll2 = new Lloguer(date, 1, v2);
		c.afegeix(ll2);		

		Vehicle v3 = new Vehicle("Seat", "Cupra", Vehicle.GENERAL);
		date = dateFormat.parse("2/8/2020");
		Lloguer ll3 = new Lloguer(date, 5, v3);
		c.afegeix(ll3);		

		System.out.print(historialClient(c));


	}
	public static String historialClient(Client c) {
		return c.informe();
		/*	Client: «nom del client»
	        «nif»
	        «telèfon»
	        Lloguers: «num de lloguers del client»
	        1. vehicle: «marca del vehícle del primer lloguer» «model»
	           data d'inici: «data d'inici del lloguer»
	           dies llogats: «nombre de dies llogats»
	        2. «... dades de la resta de lloguers del client»*/
	}
}