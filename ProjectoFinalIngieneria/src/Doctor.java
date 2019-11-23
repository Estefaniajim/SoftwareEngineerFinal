/**
 * extends from Persona
 * adds doctorID int, permit boolean
 */
public class Doctor extends Persona{
	private int doctorID;
	private boolean permiso;
	/**
	 * Create a new Doctor initializing:
	 * @param name of the doctor
	 * @param id of the doctor
	 * @param permit of the doctor
	 */
	public Doctor(String nombre, int doctorID, boolean permiso){
		super(nombre);
		this.doctorID=doctorID;
		this.permiso=permiso;
	}
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public boolean isPermiso() {
		return permiso;
	}
	public void setPermiso(boolean permiso) {
		this.permiso = permiso;
	}
	/**
	 * mehtod that adds meds to the medications of pacient
	 */
	public void modificarMeds() throws Exception {
		if (this.permiso==true){
			System.out.println("Medicamento agregado.");
			
		}
		else {
			throw new Exception("Acesso a medicamentos restringido.");
		}
	}
	
	
}
