package com.universehan.learn.agilejava;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest 
{
	@Test
	public void create()
	{
		Student me = new Student("Jane Doe");
		Student you = new Student("Jane Doe");
		
//		me.equals("Jane Doe";)
	
//		me.sayHaha();
	}
	
	
	
	@Test
	public void equalityTest()
	{
		String nullValue = null;
		
		
		assertTrue( nullValue.toString() == "");
	}
}
