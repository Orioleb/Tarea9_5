
public class Profesor extends PersonaAula {
	
	private String materia;
	private boolean disponible;
	
	public Profesor(String n, int e, char s, String m, boolean d) {
		super(n,e,s);
		if(materiaCorrecta(m)==true) {
			materia=m;
		}
		else {
			materia=null;
		}
		disponible=d;
		
	}
	
	/**
	 * Comprovem que estigui entre les materias disponibles
	 * @param materia
	 * @return
	 */
	public boolean materiaCorrecta(String materia) {
		boolean correcte=false;
		String[] materies= {"Matematicas","Filosofia","Fisica"};
		int i=0;
		while((i<materies.length)&&(correcte==false)) {
			if(materies[i].equalsIgnoreCase(materia)==true) {
				correcte=true;
			}
			i++;
		}
		return correcte;
	}
	
	//GETTERS
	public String getMateria() {
		return materia;
	}
	public boolean getDisponible() {
		return disponible;
	}
	
}
