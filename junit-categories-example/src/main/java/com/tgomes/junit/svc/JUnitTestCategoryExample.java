package com.tgomes.junit.svc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.tgomes.junit.cat.intf.FunctionalGroupTests1;

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

}
