
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula A=new Aula(3,10,"Filosofia",7);
		Profesor p=new Profesor("Joan",50,'H',"Filosofia",true);
		A.añadirProfesor(0, p);
		Estudiante e1=new Estudiante("Laura",15,'M',7);
		Estudiante e2=new Estudiante("Marc", 15,'H',3);
		Estudiante e3=new Estudiante("Albert",15,'H',6);
		Estudiante e4=new Estudiante("Guillem",16,'H',2);
		Estudiante e5=new Estudiante("Julia",15,'M',9);
		Estudiante e6=new Estudiante("Claudia",15,'M',10);
		Estudiante e7=new Estudiante("Anna",15,'M',5);
		A.añadirEstudiante(1, e1);
		A.añadirEstudiante(2, e2);
		A.añadirEstudiante(3, e3);
		A.añadirEstudiante(4, e4);
		A.añadirEstudiante(5, e5);
		A.añadirEstudiante(6, e6);
		A.añadirEstudiante(7, e7);
		if(A.darClase(p)==true) {
			System.out.println("Se puede dar clase");
			System.out.println("El numero de alumnos aprobados es "+A.aprobados());
		}
		else {
			System.out.println("NO se puede dar clase");

		}
		

	}

}
