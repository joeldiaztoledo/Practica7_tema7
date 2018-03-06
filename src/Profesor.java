
public class Profesor extends Persona {

	public Profesor(String nombre, int anyoNacimiento) {
		super(nombre, anyoNacimiento);
		
	}


	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
	
	public String toString() {
		
		String mensaje = "El profesor se llama " + super.getNombre() + " y nació en " + super.getAnyoNacimiento() + ".";
		
		return mensaje;
		
	}
	
	public double calculoDescuento(double cantidad) {
		System.out.print("A la cantidad de " + cantidad + " se le aplica un descuento del 2%: ");
		cantidad = cantidad * 0.02;
		return cantidad;
	}
	
}
