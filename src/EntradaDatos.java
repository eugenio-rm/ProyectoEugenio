import java.util.Scanner;

public class EntradaDatos {

	int metroscuadrados(){
		Scanner n1 = new Scanner(System.in);
		System.out.println("Introducir los metros cuadrados ");
		int a;
		a = n1.nextInt();
				
		return a;		
	}
	
	
	String estilos() {
		Scanner n2 = new Scanner(System.in);
		System.out.println("Introducir el estilo decorativo:"
				+ "\n1: moderno "
				+ "\n2: chipendale"
				+ "\n3: funcional");
		String estilo;
		int selector;
		selector = n2.nextInt();
		
		switch(selector) {
		case 1: estilo="moderno";
				return estilo;
		case 2: estilo="chipendale";
				return estilo;
		
		default: return "estilo no conocido";
		
		}
		}
		
		String estilos2() {
			Scanner n2 = new Scanner(System.in);
			System.out.println("Introducir el estilo decorativo:"
					+ "\nmoderno"
					+ "\nchipendale"
					+ "\nfuncional");
			String estilo;
			estilo = n2.nextLine();
			
			switch(estilo) {
			case "moderno": 
					return estilo;
			case "chipendale":
					return estilo;
			case "funcional":
				return estilo;
			default: return "estilo no conocido";
			}
		
		
		
		
	}
	

	
	
}
