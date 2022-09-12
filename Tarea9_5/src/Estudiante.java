
public class Estudiante extends PersonaAula{
	
	private double calificacion;
	
	public Estudiante(String n, int e, char s, double c) {
		super(n,e,s);
		calificacion=c;
		
	}
	
	//GET
	public double getCalificacion() {
		return calificacion;
	}
	/**
	 * Metodo que si la clasificacion es igual o mayor a 5 indicara que el alumno esta aprobado
	 * @return
	 */
	public boolean Aprobado() {
		boolean aprobado=false;
		if(calificacion>=5) {
			aprobado=true;
		}
		return aprobado;
	}


}
