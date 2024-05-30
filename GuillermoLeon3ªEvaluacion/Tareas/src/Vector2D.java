/**
 * Clase Vector
 * @author yo
 * @version 30/05/2024A
 * @see <a href = "https://es.wikipedia.org/wiki/Producto_escalar" /> wikipedia.com – Producto escalar </a>
 * */
 
public class Vector2D {
	/*
	 * Atributos de la clase verctor2D
	 * @param x,y
	 */
public Integer x, y;

	/*
	 * Constructor para el verctor
	 * @param x, y
	 */
	Vector2D(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	/* Construct Vector2D from two points */
	/*
	 * Constructor usando dos objetos de la clase Punto
	 * @param p1, p2
	 */
	Vector2D(Point p1, Point p2) {
		this.x = p2.x - p1.x;
		this.y = p2.y - p1.y;
	}
	
	/*
	 * Metodo para calcular el producto de dos vectores
	 * @param v el verctor del cual queremos calcular el producto
	 * @return el producto del verctor
	 */
	public int dotProduct(Vector2D v) {
		return (x * v.x) + (y * v.y);
	}
	
	/*
	 * Metodo para calcular si el vector es ortogonal a otro
	 * @param v, el vector al que queremos calcular si es ortogonal
	 * @return true, false, si es ortogonal devolvera true y si no false
	 */
	public boolean isOrthogonalTo(Vector2D v) {
		return (dotProduct(v) == 0);
	}
}
