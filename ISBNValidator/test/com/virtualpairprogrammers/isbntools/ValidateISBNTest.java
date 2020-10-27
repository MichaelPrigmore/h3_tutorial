package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest
{

	@Test
	public void check_a_valid_ISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first value", result);
		result = validator.checkISBN("0140177396");
		assertTrue("second value", result);
	}

	@Test
	public void check_an_invalid_ISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449117");
		assertFalse(result);
	}

	@Test(expected = NumberFormatException.class)
	public void nine_digit_ISBN_are_not_allowed()
	{
		ValidateISBN validator = new ValidateISBN();
		validator.checkISBN("123456789");
	}

	@Test(expected = NumberFormatException.class)
	public void only_use_numbers()
	{
		ValidateISBN validator = new ValidateISBN();
		validator.checkISBN("helloworld");
	}

}
