package br.com.nordestefomento.jrimum.utilix;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.nordestefomento.jrimum.utilix.Operator4String;

public class TestOperator4String {

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
	public void testEliminateSymbols() {
		
		assertEquals("", Operator4String.eliminateSymbols("><,;.:!*&%+-_<>[]\\/"));
	}

}
