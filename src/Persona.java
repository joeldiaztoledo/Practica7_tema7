
public abstract class Persona {

	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}
	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	private int anyoNacimiento;
	
	public Persona (String nombre, int anyoNacimiento) {
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public abstract double calculoDescuento(double cantidad);
	
	public String toString() {
		String mensaje = "La persona se llama " + nombre + " y nació en " + anyoNacimiento + ".";
		return mensaje;
	}
	
	
}
