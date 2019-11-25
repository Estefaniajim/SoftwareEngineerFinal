/**
 * adds medications that are contradutory  Medicamento[],  medications  Medicamento[] 
 * and a counter to cout how many meds are gonna be added to the list.
 */
public class Prescripcion {
	int cont;
	Medicamento contradiciones[]= new Medicamento[cont];
	Medicamento medicamentos[]= new Medicamento[cont];
	
	
	public Medicamento[] getContradiciones() {
		return contradiciones;
	}

	public Medicamento[] getMedicamentos() {
		return medicamentos;
	}
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public Prescripcion(int cont, Medicamento[] contradiciones, Medicamento[] medicamentos) {
		super();
		this.cont = cont;
		this.contradiciones = contradiciones;
		this.medicamentos = medicamentos;
	}
	
}
