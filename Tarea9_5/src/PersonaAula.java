
public abstract class PersonaAula {
	//CLASE PADRE DE ESTDUAINTE Y PROFESOR
	protected String nombre;
	protected int edad;
	protected char sexo;
	
	public PersonaAula(String n, int e, char s) {
		nombre=n;
		edad=e;
		sexo=s;
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public char getSexo() {
		return sexo;
	}

}
