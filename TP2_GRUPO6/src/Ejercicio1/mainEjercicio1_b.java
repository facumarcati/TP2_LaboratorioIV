package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Profesor> listaProfes = new TreeSet<Profesor>();
		
		Profesor p1 = new Profesor("Cargo 1", 1, 1, "Profesor 1");
		Profesor p2 = new Profesor("Cargo 2", 2, 2, "Profesor 2");
		Profesor p3 = new Profesor("Cargo 3", 3, 3, "Profesor 3");
		Profesor p4 = new Profesor();
		Profesor p5 = new Profesor("Cargo 5", 5, 5, "Profesor 5");
		
		listaProfes.add(p1);
		listaProfes.add(p2);
		listaProfes.add(p5);
		listaProfes.add(p4);
		listaProfes.add(p3);
		
		Iterator<Profesor> it = listaProfes.iterator();
		
		while (it.hasNext()) {
			Profesor profesor = it.next();			
			System.out.println(profesor.toString());
		}
		
	}

}
