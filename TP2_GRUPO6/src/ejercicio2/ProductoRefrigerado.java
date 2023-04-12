package ejercicio2;

import java.util.Date;

public class ProductoRefrigerado extends Producto{

	private int codeCtrlAlimentario;
	
	public ProductoRefrigerado(int codeCtrlAlimentario, Date fechaCaducidad, int nroLote) {
		super(fechaCaducidad, nroLote);
		this.codeCtrlAlimentario = codeCtrlAlimentario;
	}

	public int getCodeCtrlAlimentario() {
		return codeCtrlAlimentario;
	}

	public void setCodeCtrlAlimentario(int codeCtrlAlimentario) {
		this.codeCtrlAlimentario = codeCtrlAlimentario;
	}

	
	

}
