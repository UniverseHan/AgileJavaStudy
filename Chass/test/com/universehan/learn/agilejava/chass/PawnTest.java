package com.universehan.learn.agilejava.chass;

import static org.junit.Assert.*;

import org.junit.Test;

public class PawnTest 
{
	@Test
	public void create()
	{
		final String firstPawnColor = "white";
		Pawn pawn = new Pawn(firstPawnColor);
		assertEquals(firstPawnColor, pawn.getColor());
		
		Pawn secondPawn = new Pawn("black");
		assertEquals("black", secondPawn.getColor());
	}
}
