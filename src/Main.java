import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int opcion = 35;
		double cantidadAlu = 0;
		double cantidadProf = 0;
		Scanner sc = new Scanner(System.in);
		
		Persona Profesor = new Profesor("Jonay", 1985);
		Persona Alumno = new Alumno("Joel", 1995);
		
		while (opcion != 0) {
			
			System.out.println("\n ¿Que desea hacer?");
			System.out.println("Pulse 1 para mostrar la informacion del profesor.");
			System.out.println("Pulse 2 para mostrar la informacion del alumno.");
			System.out.println("Pulse 3 para calcular un descuento para profesor.");
			System.out.println("Pulse 4 para calcular un descuento para alumno.");
			System.out.println("Pulse 0 para salir del programa");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1: 	System.out.println(Profesor.toString());
						break;
			
			case 2: 	System.out.println(Alumno.toString());
						break;
			
			case 3: 	System.out.println("Introduzca la cantidad: ");
						cantidadProf = sc.nextDouble();
						System.out.print(Profesor.calculoDescuento(cantidadProf));
						break;
			
			case 4: 	System.out.println("Introduzca la cantidad: ");
						cantidadAlu = sc.nextDouble();
						System.out.print(Alumno.calculoDescuento(cantidadAlu));
						break;
						
			case 0: 	System.out.println("Finalizando programa.");
						break;
			
			default: 	System.out.println("Opción no válida. Finalizando programa.");
						break;
			}
			
		}
		sc.close();
	}

}
