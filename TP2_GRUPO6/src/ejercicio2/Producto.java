package ejercicio2;

import java.util.Date;

public class Producto {
	
	private Date fechaCaducidad;
	private int nroLote;
	
	public Producto(Date fechaCaducidad, int nroLote){
		this.fechaCaducidad = fechaCaducidad;
		this.nroLote = nroLote;
	}
	
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNroLote() {
		return nroLote;
	}
	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}
	
	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", nroLote=" + nroLote + "]";
	}


}
