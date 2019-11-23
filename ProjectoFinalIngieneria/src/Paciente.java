import java.sql.Date;

/**
 * extends from Persona
 * adds start of treatment Date, end of treatment date, prescriptions medications[], contradictions medications[]
 */
public class Paciente extends Persona{
	private Date iniTratamiento;
	private Date finTratamiento;
	/**
	 * Create a new Pacient initializing:
	 * @param name of the person
	 * @param age of the person
	 * @param date of birth of the person
	 * @param weight of the person
	 * @param height of the person
	 * @param dates of treatment
	 */
	public Paciente(String nombre, int edad, Date nacimiento, int peso, int altura, Date iniTratamiento, Date finTratamiento) {
		super(nombre,edad,nacimiento, peso, altura);
		this.iniTratamiento=iniTratamiento;
		this.finTratamiento=finTratamiento;
	}
	public Date getIniTratamiento() {
		return iniTratamiento;
	}
	public void setIniTratamiento(Date iniTratamiento) {
		this.iniTratamiento = iniTratamiento;
	}
	public Date getFinTratamiento() {
		return finTratamiento;
	}
	public void setFinTratamiento(Date finTratamiento) {
		this.finTratamiento = finTratamiento;
	}
	
	

}
