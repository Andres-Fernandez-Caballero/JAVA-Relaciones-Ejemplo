package domain;

// Esta entidad es Asignacion no Nota
public class Nota { // EN el enunciado dice que un alumno puede tener 3 o varias notas, por eso
					// deberia ser un array de notas
	public int nota1;
	public int nota2;
	public int nota3;

	public Nota(int nota1, int nota2, int nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public double calcularPromedio() {
		return (double) (nota1 + nota2 + nota3) / 3;
	}

	// void estadoNota(){
	// if (this.calcularPromedio() >= 6) {
	// System.out.println("APROBADO");
	//
	// }else {
	// System.out.println("REPROBADO");
	//
	// }
	// }

	public boolean estadoNota() { // considerar cambiar el modificador de acceso a privado
		/*
		 * if(this.calcularPromedio() >= 6) {
		 * return true;
		 * }else {
		 * return false;
		 * }
		 */
		return this.calcularPromedio() >= 6;
	}

	public String mostrarEnCadena() {
		return String.format(estadoNota() ? "APROBADO" : "REPROBADO");
	}

	@Override
	public String toString() {
		return "Notas [Parcial 1= " + nota1 + ", Parcial 2= " + nota2 + " Promedio= " + calcularPromedio() + " Estado: "
				+ mostrarEnCadena() + "]";
	}

}
