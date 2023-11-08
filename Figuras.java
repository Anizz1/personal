package Figuras;

public class Figuras {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		Punto p1 = new Punto(); //Se crea el objeto y esta lleno de ceros desde el constructutor
		Punto p2 = new Punto(1, 2);
		
		Recta r1 = new Recta(p1);
	//	Recta r2 = new Recta(3.0, 4.0);
		
		
		
		//Se imprimen los metodos de Punto
		System.out.println("P1");
		System.out.println(p1.getX());
		System.out.println("P2");
		System.out.println(p2.getX());
		
		//imprime los métodos de Recta
		System.out.println("R1");
		System.out.println(r1.getPx(p1));
		System.out.println("R2");
		System.out.println(r1.getPx(p2));
		
		//Se mandan modifican los metodos
		System.out.printf("El valor nuevo de p\n");
		p1.setX(8);
		System.out.println(p1.getX());
		System.out.println("La distancia entre puntos");
		System.out.println(p1.distancia(p2)); //imprimir la distancia
		System.out.println(p1 + " " + p2); //imprimir la distancia
		p1.setX(1);
		p2.setY(2);
		System.out.println("Los puntos son iguales");
		System.out.println(p1.equals(p2)); //Un bool nunca se compara con un equals 
		System.out.println("Las coordenadas de los puntos son:");
		System.out.println(p1 + " " + p2); //imprimir la cadena ToString
		
		//Se modifican los métodos de la recta
		System.out.println("El valor nuevo de la recta es: ");
		r1.setPx(5);
		System.out.println(r1.getPx(p1));
		System.out.println(r1.getPy(p2));
		
		System.out.println("la recta es perpendicular:");
	//	System.out.println(r1.esPerpendicular(r1, p2, r2));
		
		System.out.println("La pendiente es:");
		//System.out.println(r1.pendiente(p2, 0, r2));
		//System.out.println(r1 + " " + r2);
		
		
		
		
		//System.out.println();
	}

}
