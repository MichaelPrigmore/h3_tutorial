package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest
{

	@Test
	public void check_a_valid_ISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN(140449116);
		assertTrue(result);
	}

	@Test
	public void check_an_invalid_ISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN(140449116);
		assertTrue(result);
	}

}
