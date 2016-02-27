package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	MyInteger myInt = new MyInteger(3);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void isEvenTest(){
		assertEquals(false, myInt.isEven());
		assertEquals(false, MyInteger.isEven(3));
	}
	
	@Test
	public void isOddTest(){
		assertEquals(true, myInt.isOdd());
		assertEquals(true, MyInteger.isOdd(3));
	}
	
	@Test
	public void isPrimeTest(){
		assertEquals(true, myInt.isPrime());
		assertEquals(true, MyInteger.isPrime(97));
	}
	
	

}
