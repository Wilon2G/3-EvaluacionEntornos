/*
 * Clase Punto
 * @param x,y
 * La clase punto nos sirve para definir un punto en un plano 2D
 * @version 30/05/2024A
 * @see <a href = "https://es.wikipedia.org/wiki/Producto_escalar" /> wikipedia.com – Producto escalar </a>
 */
public class Point {
	/*
	 * Atributos de la classe Punto
	 * @param x, y, coordenada en el eje x y coordenada en el eje y
	 */
public Integer x, y;
	
/*
 * Constructor para la clase punto
 * @param x,y las coordenadas del eje x y las coordenadas del eje y
 */
	Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	 * Metodo para añadir un punto al punto creado, esto sumara las coordenadas en x e y de ambos puntos
	 * @param p el punto que queremos sumar
	 * @return point el nuevo punto resultante de la suma
	 */
	public Point add(Point p) {
		return new Point(x + p.x, y + p.y);
	}
	
	/*
	 * Metodo para substraer un punto de otro
	 * @param p, el punto que queremos substraer
	 * @return point el punto resultante de la suma
	 */
	public Point sub(Point p) {
		return new Point(x - p.x, y - p.y);
	}
}
