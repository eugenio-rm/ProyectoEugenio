import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Esta es la clase principal de mi proyecto de lo que sea
		//para la asignatura de ticII 
		//Aquí se incluye el funcionamiento

		EntradaDatos ed = new EntradaDatos();
		//int metros = ed.metroscuadrados();
		/*		
		//int habitaciones = ed.habitaciones();
		
		String estilo = ed.estilos();
		
		
		
		Casa c1 = new Casa();
	//	int presupuesto = c1.presupuesto(metros, habitaciones, estilo )
*/		
		
		String estilos1 = ed.estilos();
		System.out.println(estilos1);
		
		//String estilos2 = ed.estilos2();
		System.out.println(ed.estilos2());
		
		
		
		
	}

}
