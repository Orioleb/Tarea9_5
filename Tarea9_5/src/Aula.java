
public class Aula {
	private int id;
	private int maxestudiantes;
	private String asignatura;
	private int estudiantesactuales;
	private PersonaAula[] llista;
	
	/**
	 * Metodo constructor
	 * @param id
	 * @param max
	 * @param asignatura
	 * @param e
	 */
	public Aula(int id, int max, String asignatura, int e) {
		this.id=id;
		maxestudiantes=max;
		this.asignatura=asignatura;
		estudiantesactuales=e;
		llista=new PersonaAula[estudiantesactuales+1];
	}
	//CREACION LISTA
	public void añadirProfesor(int pos, Profesor p) {
		llista[pos]=p;
	}
	public void añadirEstudiante(int pos, Estudiante e) {
		llista[pos]=e;
	}
	
	/**
	 * Metodo que determinara si se puede dar clase o no
	 * @return
	 */
	public boolean darClase(Profesor p1) {
		boolean clase=false;
		boolean alumnossuficientes=false;
		if(estudiantesactuales>maxestudiantes*0.5) {
			alumnossuficientes=true;
		}
		if((alumnossuficientes==true)&&(asignatura.equalsIgnoreCase(p1.getMateria())==true)&&(p1.getDisponible()==true)) {
			clase=true;
		}
		return clase;
		
	}
	/**
	 * Se contaran el numero de aprobados
	 * @return
	 */
	public int aprobados() {
		int cont=0;
		for(int i=1;i<llista.length;i++) {
				if((((Estudiante)llista[i]).Aprobado()==true)) {
					cont++;
				}
		}
		return cont;
	}
	

}
