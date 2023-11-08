package Figuras;


public class Recta extends Punto {
	//Atributos
	private double px; // esto seria el punto inicial
	private double py; // esto seria el punto final
	
	//Constructor de un objeto Recta
	public Recta(Punto p){
		setX(0.0);  //punto x inicial
		setY(0.0);  //punto y inicial
		px = 0.0; //Punto x final
		py = 0.0;  //Punto y final
		
		
	} // nunca devuelven nada
	
	
	//Contructor a partir de parametros 
	public Recta(double px, double py, double xi , double yi) {
		this.px = px;
		this.py = py;
		xi = getX() ;
		yi = getY() ;
	}
	
	//COMPORTAMIENTO
	//La línea tiene el comportamiento siguiente:
	//***************++++++++++++++******************
	
	//Método de acceso de la coordenada x	
	public double getPx(Punto p) {
		return px;
	}
	//Método de acceso de la coordenada del punto y
	public double getPy(Punto p) {
		return py;
	}
	//Método modificador del atributo coordenada de x
	//@param x * Nuevo valor para coordenada x
	public void setPx(double px) {
		this.px = px;
	}
	//Método modificador del atributo coordenada de y
	//@param y * Nuevo valor para y
	public void setPy(double py) {
		this.py = py;
	}
	
	
	//Método para calcular la pendiente de la recta
	public double pendiente(Punto p, double M, Recta r) { //LLamamos al objeto Punto 
	//M = (y1 - y2) / (x2 - x1) 
		/*
		setX(0.0);  //punto x inicial
		setY(0.0);  //punto y inicial
		px = 0.0; //Punto x final
		py = 0.0;  //Punto y final
		//M = (p.getY() - py) / (px - p.getX());
		 */
		M = (p.getY() - py ) / (px - p.getX() );
	
		return  M;
		
	}
	
	//Método para calcular la ordenada de la recta
	public double ordenada(Punto p, double y, double m, double b) {
		//y = m* this.x + b;
		return y = m * p.getX() + b;
	}
	
	//Método para verificar si la recta esta contenida
	public boolean contiene (Punto p, Object o) {
		
		return false;
	}
	
	//Método para saber si es perpendicular
	public boolean esPerpendicular(Recta r1, Recta r) {
		//Si el producto de las pendientes es -1, entonces es perpendicular
		if(r1 instanceof Recta ) {
			Recta r2 = (Recta)r2;
			return r1 * r2 == -1;
			
			
			
		}
		return false;
	}
	
//  M = (y1 - y2) / (x2 - x1) otra forma es
		//recta original = M1 = -x/y
		//recta perpecdicular M2 = -1/m1
	
	
	
	
	
	
	//Método para saber si la recta tiene intersección
	//interseccion(Recta):Punto
	@SuppressWarnings("unused")
	public boolean Intersección(Recta r, Punto p, Object o) {
	//Punto interseccion (Recta o)
		if( r instanceof Recta)
		double X = this.getX();
		return o;
		
	}
	
	//Método para saber si 
	
	/*
	 * Método que determina si una recta y otro objeto son iguales
	 * @param r - Objeto para el cual comparar
	 * @return boolean - true si las rectas son iguales ; false en otro caso
	 */
	@SuppressWarnings("unused")
	@Override
	public boolean equals(Object o) {
		if (o instanceof Recta) {
		Recta r = (Recta)o;
		return this.px == px && this.py == py;
		}
		return false;
	}
	/*
	 *Representación en formato cadena de una recta
	 *@return  
	 */
	public String toString() {
		return "("+ this.px + ", " + this.py + ")";
	}
	
	
	

}







