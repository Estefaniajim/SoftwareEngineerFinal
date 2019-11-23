/**
 * extends from Medicamento
 * adds medications that are contradutory  Medicamento[],  medications  Medicamento[] 
 * and a counter to cout how many meds are gonna be added to the list.
 */
public class Prescripcion extends Medicamento{
	int cont;
	Medicamento contradiciones[]= new Medicamento[cont];
	Medicamento medicamentos[]= new Medicamento[cont];
	
	public Prescripcion(String nombre, int dosis, String presentacion, int cont) {
		super(nombre, dosis, presentacion);
		this.cont=cont;
	}
	
	public Prescripcion(String nombre, int cont) {
		super(nombre);
		this.cont=cont;
	}
	
	public Medicamento[] getContradiciones() {
		return contradiciones;
	}
	public void setContradiciones(Medicamento[] contradiciones) {
		this.contradiciones = contradiciones;
	}
	public Medicamento[] getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(Medicamento[] medicamentos) {
		this.medicamentos = medicamentos;
	}
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
}
