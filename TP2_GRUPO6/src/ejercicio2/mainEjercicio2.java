package ejercicio2;
import java.util.Date;
import java.util.ListIterator;
import java.util.ArrayList;
import Ejercicio1.Profesor;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		ArrayList<iMostrar> listaProductos = new ArrayList<iMostrar>(3);
		listaProductos.add(new ProductoCongelado(1, "01/12/2023", 1000));
		listaProductos.add(new ProductoFresco("13/04/2023", "Argentina" ,"01/12/2023", 10001));
		listaProductos.add(new ProductoRefrigerado(1001,"01/12/2023", 1002));
		
		ListIterator<iMostrar> it = listaProductos.listIterator();
		while (it.hasNext()) {
			iMostrar producto = it.next();			
			System.out.println(producto.mostrarInformacion());
		}
		
	}

}
