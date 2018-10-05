import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class pruebasUnitarias {
	
	private NumComplejo c1;
	private NumComplejo c2 = new NumComplejo(1,1);
	private double [] nums = {1,0};
	private double [] nums2 = null;

	@Before 
	public void antesQue() {
		c1 = new NumComplejo(1,0);
	}
	
	@Test
	public void sumaTest() {
		c1 = c1.sumarComplejos(c1, c2);
		assertEquals(2.0,c1.getpReal(),0);
		assertEquals(1.0, c1.getpImaginaria(),0);
	}
	
	@Test
	public void restaTest() {
		c1 = c1.restarComplejos(c1, c2);
		assertEquals(0.0,c1.getpReal(),0);
		assertEquals(-1.0, c1.getpImaginaria(), 0);
	}
	
	@Test
	public void multiplicarTest() {
		c1 = c1.multiplicarComplejos(c1, c2);
		assertEquals(1.0,c1.getpReal(),0);
		assertEquals(1.0,c1.getpImaginaria(),0);
	}
	
	 @Test
	 public void dividirTest() {
		 c1 = c1.dividirComplejos(c1, c2);
		 assertEquals(0.5, c1.getpReal(), 0);
		 assertEquals(-0.5, c1.getpImaginaria(),0);
	 }

	@Test
	public void array() {
		assertArrayEquals(nums, c1.getUnArray(c1), 0);
	}
	
	@Test
	public void esTrue() {
		assertTrue(c1.esPositivo(c1.getpReal()));
	}
	
	@Test
	public void esFalse() {
		assertFalse(c1.esPositivo(c1.getpImaginaria()));
	}
	
	@Test
	public void esNull() {
		assertNull(nums2);
	}
	
	@Test
	public void theSame() {
		System.out.println("Array antes de modificarse: " + nums[0] + " " + nums[1]);
		c1.getOtroArray(nums);
		assertSame(nums, nums);
		System.out.println("Array despues de modificarse: " + nums[0] + " " + nums[1]);
	}
	
	@Test
	public void noTheSame() {
		assertNotSame(c1, c2);
	}
	
	@Test (timeout = 5000)
	public void time () throws InterruptedException {
		int i = c1.time();
	}
}
