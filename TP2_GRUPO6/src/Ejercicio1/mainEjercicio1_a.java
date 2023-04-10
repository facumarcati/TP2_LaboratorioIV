package Ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor p1 = new Profesor("Cargo 1", 1, 1, "Profesor 1");
		Profesor p2 = new Profesor("Cargo 2", 2, 2, "Profesor 2");
		Profesor p3 = new Profesor("Cargo 3", 3, 3, "Profesor 3");
		Profesor p4 = new Profesor("Cargo 4", 4, 4, "Profesor 4");
		Profesor p5 = new Profesor("Cargo 5", 5, 5, "Profesor 5");
		
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
		
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
		
		ListIterator<Profesor> it = listaProfesores.listIterator();
		while (it.hasNext()) {
			Profesor profesor = it.next();			
			System.out.println(profesor.toString());
		}
	}

}
