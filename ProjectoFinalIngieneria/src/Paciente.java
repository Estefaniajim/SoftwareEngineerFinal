import java.sql.Date;
/**
 * extends from Persona
 * adds start of treatment Date, end of treatment date, prescriptions medications[], contradictions medications[]
 */
public class Paciente extends Persona{
	private String id;
	Prescripcion medicamentos[]= new Prescripcion[5];
	private String dx;
	/**
	 * Create a new Pacient initializing:
	 * @param name of the person
	 * @param age of the person
	 * @param date of birth of the person
	 * @param weight of the person
	 * @param height of the person
	 * @param dates of treatment
	 */
	public Paciente(String nombre, int edad, Date nacimiento, int peso, int altura, String id,
			Prescripcion[] medicamentos) {
		super(nombre, edad, nacimiento, peso, altura);
		this.id = id;
		this.medicamentos = medicamentos;
	}
	public String getId() {
		return id;
	}
	public Prescripcion[] getMedicamentos() {
		return medicamentos;
	}
	public String getDx() {
		return dx;
	}

}
