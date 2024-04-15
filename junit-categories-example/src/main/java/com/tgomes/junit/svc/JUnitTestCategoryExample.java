package com.tgomes.junit.svc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.tgomes.junit.cat.intf.FunctionalGroupTests1;
import com.tgomes.junit.cat.intf.FunctionalGroupTests2;
import com.tgomes.junit.cat.intf.IntegrationTests;
import com.tgomes.junit.cat.intf.SanityTests;

public class JUnitTestCategoryExample {

	@Test
	@Category(FunctionalGroupTests1.class)
	public void testFunctionalTests1Test1() {
		Integer numberInLoop = 0;
		for (int i = 0; i < 1000; i++) {
			numberInLoop++;
		}
		System.out.println("FunctionalGroupTests1: testFunctionalTests1Test1");
		assertTrue(numberInLoop.getClass() == Integer.class);
	}

	@Test
	@Category(FunctionalGroupTests1.class)
	public void testFunctionalTest1Test2() {
		Integer numberInLoop = 0;
		for (int i = 0; i < 4000; i++)
			numberInLoop++;

		System.out.println("FunctionalGroupTests1: testFunctionalTests1Test2");
		assertTrue(numberInLoop.getClass() == Integer.class);
	}

	@Test
	@Category(FunctionalGroupTests2.class)
	public void testFunctionalTests2Test1() {
		Integer numberInLoop = 0;
		do {
			numberInLoop++;
		} while (numberInLoop != 1000);

		System.out.println("FunctionalGroupTests2: testFunctionalTests2Test1");
		assertTrue(numberInLoop.getClass() == Integer.class);
	}

	@Test
	@Category(FunctionalGroupTests2.class)
	public void testFunctionalTests2Test2() {
		System.out.println("FunctionalGroupTests2: testFunctionalTests2Test2");
	}

	@Test
	@Category({ IntegrationTests.class, FunctionalGroupTests1.class })
	public void testIntegrationTestsTest1() {
		System.out.println("IntegrationTests: testIntegrationTestsTest2");
	}

	@Test
	@Category(SanityTests.class)
	public void testSanityTest1() {
		System.out.println("SanityTests: testSanityTestsTest1");
	}

}
