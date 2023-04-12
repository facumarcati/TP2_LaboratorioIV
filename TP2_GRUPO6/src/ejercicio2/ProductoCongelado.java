package ejercicio2;

import java.util.Date;

public class ProductoCongelado extends Producto{

	private float tempCongelacion;

	public ProductoCongelado (float tempCongelacion, Date fechaCaducidad, int nroLote) {	
		super(fechaCaducidad, nroLote);
		this.tempCongelacion = tempCongelacion;
	}
	
	public float getTempCongelacion() {
		return tempCongelacion;
	}

	public void setTempCongelacion(float tempCongelacion) {
		this.tempCongelacion = tempCongelacion;
	}
	
	
	
}
