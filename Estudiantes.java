package actividad6Villarrubia;

public class Estudiantes extends persona {
	 private String Legajo;
	 private int codigoestudiante;
	 private float notafinal;
	 private int añodeingreso;
	 private String Carreraquecursa;
	 private int Cantidaddemateriasaprobadas;
	 
	 public Estudiantes(String nombre, String apellido, int edad, String email, String telefono, String dirrecion,
			              String legajo, int codigoestudiante, float notafinal, int añodeingreso, String carreraquecursa,
			              int cantidaddemateriasaprobadas) {
		 
		super(nombre, apellido, edad, email, telefono, dirrecion);
		
		this.Legajo = legajo;
		this.codigoestudiante = codigoestudiante;
		this.notafinal = notafinal;
		this.añodeingreso = añodeingreso;
		this.Carreraquecursa = carreraquecursa;
		this.Cantidaddemateriasaprobadas = cantidaddemateriasaprobadas;
	 }

	 @Override
	 public String toString() {
		return "Estudiante [Legajo=" + Legajo + ", codigoestudiante=" + codigoestudiante + ", notafinal=" + notafinal
				+ ", añodeingreso=" + añodeingreso + ", Carreraquecursa=" + Carreraquecursa
				+ ", Cantidaddemateriasaprobadas=" + Cantidaddemateriasaprobadas + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", getEmail()=" + getEmail()
				+ ", getTelefono()=" + getTelefono() + ", getDirrecion()=" + getDirrecion() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	 }


public void mostrarDatos() {
	System.out.println( toString()  );
}
}

