package Ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;


public class mainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polideportivo p1 = new Polideportivo("Real Madrid", 10000, 1);
		Polideportivo p2 = new Polideportivo("Machester City", 10000, 1);
		Polideportivo p3 = new Polideportivo("Liverpool", 10000, 1);
		
		//EdificioDeOficinas o1 = new EdificioDeOficinas(100);
		//EdificioDeOficinas o2 = new EdificioDeOficinas(50);
		
		ArrayList<Polideportivo> listaEdificios = new ArrayList<Polideportivo>();
		
		listaEdificios.add(p1);
		listaEdificios.add(p2);
		listaEdificios.add(p3);
		//listaEdificios.add(o1);
		//listaEdificios.add(o2);
		
		ListIterator<Polideportivo> it = listaEdificios.listIterator();
		while (it.hasNext()) {
			Polideportivo polideportivo = it.next();			
			System.out.println(polideportivo.toString());
		}
	}
				
				
	}


