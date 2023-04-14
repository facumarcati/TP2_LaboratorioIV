package Ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;


public class mainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polideportivo p1 = new Polideportivo("Real Madrid", 10000, 1);
		Polideportivo p2 = new Polideportivo("Machester City", 10000, 1);
		Polideportivo p3 = new Polideportivo("Liverpool", 10000, 4);
		
		
		EdificioDeOficinas o1 = new EdificioDeOficinas(100, 1000.0);
		EdificioDeOficinas o2 = new EdificioDeOficinas(50, 20000.0);
		
		ArrayList<iEdificio> listaEdificios = new ArrayList<iEdificio>();
		
		listaEdificios.add(p1);
		listaEdificios.add(p2);
		listaEdificios.add(p3);
		listaEdificios.add(o1);
		listaEdificios.add(o2);
		
		ListIterator<iEdificio> it = listaEdificios.listIterator();
		while (it.hasNext()) {
			iEdificio iedificio = it.next();
			System.out.println(iedificio.mostrarInformacion());	
				}
	}
				
				
	}


