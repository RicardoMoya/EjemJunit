package Main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class pruebasUnitarias {

	private NumComplejo c1;
	private NumComplejo c2 = new NumComplejo(1,1);
	private double [] nums = {1,0};
	private double [] nums2 = null;
	
	/**
	 * Este método se ejecuta antes de hacer cualquier comprbación
	 */
	@Before
	public void antesQue(){
		c1 = new NumComplejo(1,0);
	}
	
	/**
	 * Comprueba el método "sumarComplejos"
	 */
	@Test
	public void sumaTest(){
		c1 = c1.sumarComplejos(c1, c2);
		assertEquals(2.0, c1.getpReal(),0);
		assertEquals(1.0, c1.getpImaginaria(),0);
	}
	
	
	/**
	 * Comprueba el método "restarComplejos"
	 */
	@Test
	public void restaTest() {
		c1 = c1.restarComplejos(c1, c2);
		assertEquals(0.0, c1.getpReal(),0);
		assertEquals(-1.0, c1.getpImaginaria(),0);
	}
	
	
	/**
	 * Comprueba el método "multiplicarComplejos"
	 */
	@Test
	public void multiplicaciónTest() {
		c1 = c1.multiplicarComplejos(c1, c2);
		System.out.println("Resultado de la multiplicación: "+c1.toString());
		assertEquals(1.0, c1.getpReal(),0);
		assertEquals(1.0, c1.getpImaginaria(),0);
	}
	
	
	/**
	 * Comprueba el método "dividirComplejos"
	 */
	@Test
	public void divisionTest() {
		c1 = c1.dividirComplejos(c1, c2);
		System.out.println("Resultado de la división: "+c1.toString());
		assertEquals(0.5, c1.getpReal(),0);
		assertEquals(-0.5, c1.getpImaginaria(),0);
	}
	
	/**
	 * Comprueba el método "modulo"
	 */
	@Test
	public void moduloTest() {
		double modulo = c2.modulo(c2);
		System.out.println("Modulo: "+modulo);
		assertEquals(Math.sqrt(2),c2.modulo(c2),0);
		
	}
	
	
	/**
	 * Comprueba si dos arrays son iguales
	 */
	@Test
	public void array(){
		assertArrayEquals(nums, c1.getUnArray(c1), 0);
	}
	
	
	/**
	 * Comprueba si el resultado es TRUE
	 */
	@Test
	public void esTrue(){
		assertTrue(c1.esPositivo(c1.getpReal()));
	}
	
	
	/**
	 * Comprueba si el resultado del método es FALSE
	 */
	@Test
	public void esFalse(){
		assertFalse(c1.esPositivo(c1.getpImaginaria()));
	}
	
	
	/**
	 * Comprueba si el parametro es nulo
	 */
	@Test
	public void esNull(){
		assertNull(nums2);
	}
	
	
	/**
	 * Comprueba si los objetos son los mismos
	 */
	@Test
	public void theSame(){
		System.out.println("Array antes de modificarse: "+nums[0]+"  "+nums[1]);
		c1.getOtroArray(nums);
		assertSame(nums, nums);
		System.out.println("Array despues de modificarse: "+nums[0]+"  "+nums[1]);
	}
	
	
	/**
	 * Comprueba si los objetos son distintos
	 */
	@Test
	public void noTheSame(){
		assertNotSame(c1, c2);
	}
	
	
	/**
	 * Comprueba que el método tarda en ejecutarse menos de 5 segundos
	 * @throws InterruptedException
	 */
	@Test (timeout=5000)
	public void time () throws InterruptedException{
		int i = c1.time();
	}

}
