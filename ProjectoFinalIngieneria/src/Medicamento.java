/**
 * Contains name string , dosis int , presentation String
 */
public class Medicamento {
	private String nombre;
	private int dosis;
	private String presentacion;
	
	/**
	 * Create a new medication initializing:
	 * @param name of the med
	 * @param dosis of the med
	 * @param type of med 
	 */
	public Medicamento(String nombre, int dosis, String presentacion) {
		this.nombre=nombre;
		this.dosis=dosis;
		this.presentacion=presentacion;
	}
	
	public Medicamento(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	

}
