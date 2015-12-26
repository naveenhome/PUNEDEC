package test.java;

import main.java.RPNCalculator;
import junit.framework.TestCase;

public class TestRPN extends TestCase{
	RPNCalculator rpnCalculator = new RPNCalculator();
	
	public void testCase1(){
		try {
			assertEquals(-4.0,	rpnCalculator.calculate("1,2,3,+,-"));
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testCase2(){
		try {
			assertEquals(4.0,	rpnCalculator.calculate("6,2,*,3,/"));
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testCase3(){
		try {
			assertEquals(1.0,	rpnCalculator.calculate("50,%,2,*"));
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testCase4(){
		try {
			assertEquals(26.0,	rpnCalculator.calculate("3,!,4,5,*,+"));
		} catch (Exception e) {
			fail();
		}
	}

	public void testCase5(){
		try {
			assertEquals(24.0,	rpnCalculator.calculate("12,3,/,!"));
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testCase6(){
		try {
			assertEquals(17.0,	rpnCalculator.calculate("2,3,^,4,5,+,+"));
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testCase7(){
		try {
			assertEquals(14.0,	rpnCalculator.calculate("5,1,2,+,4,*,+,3,-"));
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testCase8(){
		try {
			assertEquals(9.5,	rpnCalculator.calculate("2.5,3,+,4,+"));
		} catch (Exception e) {
			fail();
		}
	}
	
	public void testCase9(){
		try {
			assertEquals(5,	rpnCalculator.calculate("2+,3,+"));	
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
	public void testCase10(){
		try {
			assertEquals(5,	rpnCalculator.calculate("2,+,3"));
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	public void testCase11(){
		try {
			assertEquals(5,	rpnCalculator.calculate("+,3,2,+"));
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
	public void testCase12(){
		try {
			assertEquals(5,	rpnCalculator.calculate("2,3"));
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
	public void testCase13(){
		try {
			assertEquals(5,	rpnCalculator.calculate("2"));
			fail();
		} catch (Exception e) {
			System.out.print(e.toString());
			assertTrue(true);
		}
	}
	
	public void testCase14(){
		try {
			assertEquals(5,	rpnCalculator.calculate("+"));
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
	public void testCase15(){
		try {
			assertEquals(5,	rpnCalculator.calculate(""));
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
	public void testCase16(){
		try {
			assertEquals(5,	rpnCalculator.calculate("5,a,+"));
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
	public void testCase17(){
		try {
			assertEquals(-6.0,	rpnCalculator.calculate("-5,2,+,3,-"));
		} catch (Exception e) {
			fail();
		}
	}
	public void testCase18() throws Exception
	{
		assertEquals(4.0, rpnCalculator.calculate("2,2,+"));
		
	}
	public void testCase19() throws Exception
	{
		assertEquals(6.0, rpnCalculator.calculate("2,2,+,2,+"));
		
	}
	
	public void testCase20() throws Exception
	{
		assertEquals(6.0, rpnCalculator.calculate("2,2,+,4,+,2,-"));
		
	}
	
}
