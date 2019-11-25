/**
 * Contains size, and the list of pacients in the system
 */
public class Archivo {
	private int size;
	Paciente pacientes[]= new Paciente[size];
	/**
	 * Create a new File initializing:
	 * @param size of the list of the pacients
	 * @param list of the pacients 
	 */
	public Archivo(int size, Paciente[] contradiciones) {
		this.size = size;
		this.pacientes = contradiciones;
	}

	public int getSize() {
		return size;
	}

	public Paciente getContradiciones(int size) {
		return pacientes[size];
	}

	
}
