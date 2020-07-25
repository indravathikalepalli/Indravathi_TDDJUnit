package com.klu.epam.TDD_junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RemoveATest {

	RemoveA remove;
	@Before
	public void setup()
	{
		remove=new RemoveA();	
	}
	@Test
	public void test1A()
	{
		assertEquals("BCD",remove.removeAinFirst2("ABCD"));
	}
	@Test
	public void test2A()
	{
		assertEquals("CD",remove.removeAinFirst2("AACD"));
	}
	@Test
	public void testOneaat1()
	{
		assertEquals("BCD",remove.removeAinFirst2("BACD"));
	}
	@Test
	public void testNoa()
	{
		assertEquals("BBAA",remove.removeAinFirst2("BBAA"));
	}
	@Test
	public void test2as()
	{
		assertEquals("BAA",remove.removeAinFirst2("AABAA"));
	}
	@Test
	public void nullte()
	{
		assertEquals("",remove.removeAinFirst2(""));
	}
	@Test
	public void singleA()
	{
		assertEquals("",remove.removeAinFirst2("A"));
	}
	@Test
	public void doublea()
	{
		assertEquals("",remove.removeAinFirst2("AA"));
	}

}
