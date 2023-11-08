package Figuras;

	public class Punto {
	
		//atributos

		//public, private para el encapsulamiento
		//Coordenadas
		private double x; 
		private double y;
		
		//Constructor de un objeto Punto
		public Punto(){
			x = 0.0;
			y = 0.0;
		} // nunca devuelven nada
		
		//Contructor a partir de parametros 
		public Punto(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		//Método de acceso para el atributo x
		public double getX() {
			return this.x;
		} // devuelve un double
		
		public double getY() {
			return this.y;
		}
		//Meted modificador del atributo x
		//@paramy * Nuevo valor para y
		
		public void setX(double x) {
			this.x = x;
		}
		
		public void setY(double y) {
			this.y = y;
		}
		//Metodo para desplazar un punto
		public void desplazar(double dx, double dy ) {
			this.x += dx;
			this.y += dy;
		}
		/*
		 * Metodo para desplazar un punto 2
		 * this.x = 1
		 * this.x++
		 */
		
		//public void desplaza() {
		//	this.x = x + 1;
		//	this.y++;
		
		/*
		 * Método para calcular la distancia de un punto a otro.
		 * @param p - Primer punto
		 * @return double - Distancia entre los puntos
		 */
		public double distancia(Punto p) {  //El objeto punto y le damos un nombre
			
			//d = Math.sqrt(Math.pow(p.x - this.x , 2)) + Math.sqrt(Math.pow(p.y - this.y , 2));
			
			return Math.sqrt(Math.pow(p.x - this.x , 2)) + 
					Math.sqrt(Math.pow(p.y - this.y , 2));
		// distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));	
			//return d;
		}	
		/*
		 * Metodo para saber si tres puntos estan alineados
		 * @param p1 - primer punto 
		 * @param p2 - segundo punto
		 * @return boolean - true si están alineados; false en otro caso
		 */
		
		public boolean estanAlineados(Punto p1, Punto p2) {
			//EJERCICIO
			return false;
		}
		
		/*
		 * Método que determina si un punto y otro objeto son iguales
		 * @param o - Objeto para el cual comparar
		 * @return boolean - true si los puntos son iguales ; false en otro caso
		 */
		@Override
		public boolean equals(Object o) {
			if (o instanceof Punto) {
			Punto p = (Punto)o;
			
			return this.x == p.x && this.y == p.y;
			}
			return false;
		}
		/*
		 *Representación en formato cadena de un punto
		 *@return  
		 */
		public String toString() {
			return "("+ this.x + ", " + this.y + ")";
		}
		
		
		
}

