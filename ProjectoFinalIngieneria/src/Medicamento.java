/**
 * Contains name string , dosis int , presentation String
 */
public class Medicamento {
	private String nombre;
	private int dosis;
	private boolean presentacion;
	
	/**
	 * Create a new medication initializing:
	 * @param name of the med
	 * @param dosis of the med
	 * @param type of med 
	 */
	public Medicamento(String nombre, int dosis, boolean presentacion) {
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
	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

	public boolean isPresentacion() {
		return presentacion;
	}
}
