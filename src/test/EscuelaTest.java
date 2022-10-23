package test;
import domain.Materia;
import domain.Alumno;
import domain.Nota;

public class EscuelaTest {
	public static void main(String[] args) {
	Alumno alumno1 = new Alumno("Fede", 24);	
	Materia materia1 = new Materia("Biologia", 2);
	Nota nota1 = new Nota(5, 8, 10);
	
	
	System.out.println(alumno1);
	System.out.println(materia1);
	System.out.println(nota1);
    System.out.println("-----------------");

	
	}
}
