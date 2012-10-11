/**
 * 
 */
package ch.panter.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ch.panter.jmock.gettingstarted.MyExample;
import ch.panter.junit.gettingstarted.Junit4Test;

/**
 * @author Daniel Tiefenauer
 *
 */
public class MyExampleTest extends Junit4Test {

	private MyExample ex = new MyExample();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCapitalization() {
		assertEquals("ABC", ex.capitalize("abc"));
	}
	
	public void testIsEmpty() {
		assert(ex.isEmpty(""));
	}
	
	public void testReverse() {
		assertEquals("reuanefeit", "tiefenauer");
	}
	
	public void testJoinWithTwo() {
		assertEquals("einszwei", ex.join("eins", "zwei"));
	}
	
	public void testJoinWithThree() {
		assertEquals("einszweidrei", ex.join("eins", "zwei", "drei"));
	}
	
	public void testJoinWithTwoFail() {
		assertTrue(!"einszwei".equals(ex.join("eins", "zwei", "drei")));
	}

}
