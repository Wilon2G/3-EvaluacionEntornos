import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Vector2DTest {

	/*
	Declaracion de vectores v1, v2,v3;
	*/
	
	/*
	 * Con @Before puedo crear un método setUp() que lance una excepción y en la cual instanciamos
	 * Los vectores v1 (-2,4), v2 (1,2) y v3 (2,1) Los vectores v1 y v3 sin ortogonales por 
	 * Lo que su producto escalar es 0 Que es lo que vamos a comprobar más adelante.
	 * 
	 */
	Vector2D v1;
	Vector2D v2;
	Vector2D v3;
	
	@BeforeEach
	 public void setUp() throws Exception {
		v1=new Vector2D(-2, 4);
		v2=new Vector2D(1, 2);
		v3=new Vector2D(2, 1);
		
	}
	
	@Test
	public void testDotProduct() {
		/*
		 * Con assertEquals vamos a realizar unas pruebas unitarias del producto escalar que hemos 
		 * programado con anterioridad. Para ellos vamos acomprobar que el producto  de v1 por v3
		 * es 0 y que  el producto de v1 por v3 es....
		 */
		
		
		int expt1=0,expt2=6,expt3=4;
		
		int real1=v1.dotProduct(v3);
		int real2=v1.dotProduct(v2);
		int real3=v2.dotProduct(v3);
		
		assertEquals(expt1, real1);
		assertEquals(expt2, real2);
		assertEquals(expt3, real3);


	}
	
	
	@Test
	public void testOrthogonality() {
		/*
		 * Aqui vamos a comprobar que para los mismos vectores, que el método isOrtoghonalTo 
		 * se verifica para los vectores v1 y v3 y para el v2 y v3. Esta vez debes
		 * comprobar con los métodos AssertTrue y AssertFalse con los que convenga...
		 *  
		 */
		
		boolean real1=v1.isOrthogonalTo(v2);
		
		assertFalse(real1);
		
	}
}