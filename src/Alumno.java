
public class Alumno extends Persona {

	public Alumno(String nombre, int anyoNacimiento) {
		super(nombre, anyoNacimiento);
		
	}
	
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String toString() {
		
		String mensaje = "El alumno se llama " + super.getNombre() + " y nació en el año " + super.getAnyoNacimiento() + ".";
		
		return mensaje;
		
	}
	
	public double calculoDescuento(double cantidad) {
		System.out.print("A la cantidad de " + cantidad + " se le aplica un descuento del 10%: ");
		cantidad = cantidad * 0.1;
		return cantidad;
	}
}
