import java.sql.Date;
/**
 * Contains name string , age int , date of birth date, weight int, hight int
 */
public class Persona {
	private String nombre;
	private int edad;
	private Date nacimiento;
	private int peso;
	private int altura;
	/**
	 * Create a new student initializing:
	 * @param name of the person
	 * @param age of the person
	 * @param date of birth of the person
	 * @param weight of the person
	 * @param height of the person
	 */
	public Persona(String nombre, int edad, Date nacimiento, int peso, int altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.nacimiento=nacimiento;
		this.peso=peso;
		this.altura=altura;
	}
	/**
	 * For class doctor you can create a person initializing;
	 * @param name of the person
	 */
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	

}
