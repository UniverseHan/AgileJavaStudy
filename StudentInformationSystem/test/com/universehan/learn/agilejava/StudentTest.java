package com.universehan.learn.agilejava;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest 
{
	@Test
	public void create()
	{
		final String firstStudentName = "Jane Doe";
		Student student = new Student(firstStudentName);
		assertEquals(firstStudentName, student.getName());
		
		final String secondStudentName = "Joe Blow";
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());
	}
	
	
	
}
