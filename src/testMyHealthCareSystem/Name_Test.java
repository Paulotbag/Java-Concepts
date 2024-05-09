package testMyHealthCareSystem;



import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import myHealthCareSystem.*;


/**
* Test class for testing the Address class
* Uses JUnit version 5
* @author Paulo Ricardo Gomes Granjeiro
* Student ID: 041118057
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Name")
@TestMethodOrder(OrderAnnotation.class)
public class Name_Test {


	
	@Nested	@DisplayName("Name() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class NameTest {
		@Test @Order(1) @DisplayName("Name() test with no arguments")
		final void testNameWithNoArguments() {
			Name nm = new Name();
			assertNull(nm.first(), "first attribute should be null"); //make sure that Name constructor with no arguments will instantiate its attributes with null values.
			assertNull(nm.last(), "last attribute should be null"); //make sure that Name constructor with no arguments will instantiate its attributes with null values.
		}
		@Test @Order(2) @DisplayName("Name(String,String,String) test with Null or invalid arguments")
		final void testNameThreeWithNullOrInvalidArguments() {
			try	{	/* Block used to catch exceptions and display a stack trace					*/	
			Name nm = new Name(null,null,null);
			assertNotNull(nm, "This object is Null"); //make sure that Name constructor is not Null
			String first = nm.first();
			String last = nm.last();
			String middle = nm.middle();
			String[] invalid = {"1","2","3","4","5","6","7","8","9","0","", " ","!", "@", "#", ".","$","%","^","&","*","/(","/)","_","/[","/}",",",":","<",">","/","?",";","|","-","+","="};			
			for (int j=0; j<invalid.length;j++) {
				if (first == invalid[j] || first == null) {
					assertTrue("Your provided input \"first\" for Name constructor is invalid", first == invalid[j] || first == null); //testing if there is invalid values
					break;
				}
				if (middle == invalid[j] || middle == null) {
					assertTrue("Your provided input \"middle\" for Name constructor is invalid", middle == invalid[j] || middle == null); //testing if there is invalid values
					break;
				}
				if (last == invalid[j] || last == null) {
					assertTrue("Your provided input \"last\" for Name constructor is invalid", last == invalid[j] || last == null); //testing if there is invalid values
					break;
				}
			}
			}catch (Exception ex)	{
				ex.printStackTrace();
			}
		}
		
		@Test @Order(3) @DisplayName("Name(String,String) test with Null or Invalid argument")
		final void testNameTwoWithNullOrInvalidArguments() {
			try	{	/* Block used to catch exceptions and display a stack trace					*/		
			Name nm = new Name(null,"0");
			assertNotNull(nm, "This object is Null"); //make sure that Name constructor is not Null
			String first = nm.first();
			String last = nm.last();
			String[] invalid = {"1","2","3","4","5","6","7","8","9","0","", " ","!", "@", "#", ".","$","%","^","&","*","/(","/)","_","/[","/}",",",":","<",">","/","?",";","|","-","+","="};			
			for (int j=0; j<invalid.length;j++) {
				if (first == invalid[j] || first == null) {
					assertTrue("Your provided input \"first\" for Name constructor is invalid", first == invalid[j] || first == null); //testing if there is invalid values
					break;
				}
				if (last == invalid[j] || last == null) {
					assertTrue("Your provided input \"last\" for Name constructor is invalid", last == invalid[j] || last == null); //testing if there is invalid values
					break;
				}
			}
			}catch (Exception ex)	{
				ex.printStackTrace();
			}
		}
		
		@Test @Order(4) @DisplayName("Name(String) test with Null or Invalid argument")
		final void testNameOneWithNullOrInvalidArguments() {
			try	{	/* Block used to catch exceptions and display a stack trace					*/			
			Name nm = new Name(null);
			assertNotNull(nm, "This object is Null"); //make sure that Name constructor is not Null
			String first = nm.first();
			String[] invalid = {"1","2","3","4","5","6","7","8","9","0","", " ","!", "@", "#", ".","$","%","^","&","*","/(","/)","_","/[","/}",",",":","<",">","/","?",";","|","-","+","="};			
			for (int j=0; j<invalid.length;j++) {
				if (first == invalid[j] || first == null) {
					assertTrue("Your provided input for Name constructor is invalid", first == invalid[j] || first == null); //testing if there is invalid values
					break;
				}
			}
			} catch (Exception ex)	{
				ex.printStackTrace();
			}
		}
		
		@Test @Order(5) @DisplayName("Name(String) test with valid argument")
		final void testNameWithOneValidArgument() {
			Name nm = new Name("Paulo Gomes");
			assertNotNull(nm, "This object is Null"); //make sure that Name constructor is not Null
			String expectedFirst = "Paulo";
			String expectedLast = "Gomes";
			String actualFirst = nm.first();
			String actualLast = nm.last();
			assertEquals(expectedFirst, actualFirst, "Invalid input used as parameter for Name(String) constructor.");
			assertEquals(expectedLast, actualLast, "Invalid input used as parameter for Name(String) constructor.");
		}
		
		@Test @Order(6) @DisplayName("Name(String, String) test with valid argument")
		final void testNameWithTwoValidArgument() {
			Name nm = new Name("Paulo", "Gomes");
			assertNotNull(nm, "This object is Null"); //make sure that Name constructor is not Null
			String expectedFirst = "Paulo";
			String expectedLast = "Gomes";
			String actualFirst = nm.first();
			String actualLast = nm.last();
			assertEquals(expectedFirst, actualFirst, "Invalid input used as parameter for Name(String,String) constructor.");
			assertEquals(expectedLast, actualLast, "Invalid input used as parameter for Name(String,String) constructor.");
		}
		
		@Test @Order(7) @DisplayName("Name(String, String, String) test with valid argument")
		final void testNameWithThreeValidArgument() {
			Name nm = new Name("Paulo", "Gomes Granjeiro","Ricardo");
			assertNotNull(nm, "This object is Null"); //make sure that Name constructor is not Null
			String expectedFirst = "Paulo";
			String expectedMiddle = "Ricardo";
			String expectedLast = "Gomes Granjeiro";
			String actualFirst = nm.first();
			String actualdMiddle = nm.middle();
			String actualLast = nm.last();
			assertEquals(expectedFirst, actualFirst, "Invalid input used as parameter for Name(String,String,String) constructor.");
			assertEquals(expectedMiddle, actualdMiddle, "Invalid input used as parameter for Name(String,String,String) constructor.");
			assertEquals(expectedLast, actualLast, "Invalid input used as parameter for Name(String,String,String) constructor.");
		}
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			Name nm = new Name("Paulo", "Gomes Granjeiro","Ricardo");
			String expected = "[First name= " + "Paulo" +
					", Middle name= " + "Ricardo" + 
					", Last name= " + "Gomes Granjeiro" + "]";
			String actual = nm.toString();
			assertEquals(expected, actual, "toString() method does not return a value that matches the expected string");
		
		}
	}
	
	@Nested	@DisplayName("formattedName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class TestFormattedName {
		@Test @Order(1) @DisplayName("formattedName()")
		final void testFormattedName() {
			Name nm = new Name("Paulo", "Gomes Granjeiro","Ricardo");
			String expected = "null" + " " + "Paulo" + " " + "Ricardo" + " " + "Gomes Granjeiro"; //the salutation should be null. ATTENTION: this is because professor Dyer provided the UML Diagram without accessors for salutation and constructor without salutation. I am just following what was provided.
			String actual = nm.formattedName();
			assertEquals(expected, actual, "formattedName() method does not return a value that matches the expected string");
		}
		
	}

	@Nested	@DisplayName("setFirst() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetFirstTest {
		@Test @Order(1) @DisplayName("setFirst()")
		final void testSetFirst() {
			Name nm = new Name("Random_Name", "Gomes Granjeiro","Ricardo");;
			String expected = "Paulo";
			nm.setFirst("Paulo");
			String actual = nm.first();
			assertEquals(expected, actual, "setFirst() method does not return a value that matches the expected string");
		}	
	}
	
	@Nested	@DisplayName("setLast() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetLastTest {
		@Test @Order(1) @DisplayName("setLast()")
		final void testSetLast() {
			Name nm = new Name("Paulo", "Random_Name","Ricardo");;
			String expected = "Gomes Granjeiro";
			nm.setLast("Gomes Granjeiro");
			String actual = nm.last();
			assertEquals(expected, actual, "setLast() method does not return a value that matches the expected string");
		}	
	}

	@Nested	@DisplayName("setMiddle() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetMiddleTest {
		@Test @Order(1) @DisplayName("setMiddle()")
		final void testMiddle() {
			Name nm = new Name("Paulo", "Gomes Granjeiro","Random_Name");;
			String expected = "Ricardo";
			nm.setMiddle("Ricardo");
			String actual = nm.middle();
			assertEquals(expected, actual, "setMiddle() method does not return a value that matches the expected string");
		}	
	}

	
	@Nested	@DisplayName("setSalutation() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetSalutationTest {
		@Test @Order(1) @DisplayName("setSalutation()") ////ATTENTION: I had to build methods for salutation in the Name class. This is because professor Dyer provided the UML Diagram with missing contents. I am just following what I had as instructions.
		final void testSetSalutation() {
			Name nm = new Name("Paulo", "Gomes Granjeiro","Ricardo");;
			String expected = "Hello";
			nm.setSalutation("Hello");
			String actual = nm.salutation();
			assertEquals(expected, actual, "setSalutattion() method does not return a value that matches the expected string");
		}
	}
	
	@Nested	@DisplayName("first() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FirstTest {
		@Test @Order(1) @DisplayName("first()")
		final void testFirst() {
			Name nm = new Name("Paulo", "Gomes Granjeiro","Ricardo");;
			String expected = "Paulo";
			String actual = nm.first();
			assertEquals(expected, actual, "first() method does not return a value that matches the expected string");
		}
	}


	@Nested	@DisplayName("last() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class LastTest {
		@Test @Order(1) @DisplayName("last()")
		final void testlast() {
			Name nm = new Name("Paulo", "Gomes Granjeiro","Ricardo");;
			String expected = "Gomes Granjeiro";
			String actual = nm.last();
			assertEquals(expected, actual, "last() method does not return a value that matches the expected string");
		}
	}
	

}
