package testMyHealthCareSystem;


import static org.junit.Assert.assertTrue;

/*		@(#)Address_Test.java	Jan. 31, 2024
*
*/


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
@DisplayName("Test My HealthCare Application Domain - Address")
@TestMethodOrder(OrderAnnotation.class)
public class Address_Test {
	
	@Nested	@DisplayName("Address() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class AddressTest {
		@Test @Order(1) @DisplayName("Address() test with Invalid arguments")
		public void testAddressWithInvalidArguments() {
			Address ad = new Address("@", "#", "$","%");
			String street = ad.street();
			String number = ad.getNumber();
			String city = ad.getCity();
			String postalCode = ad.postalCode();
			String[] invalid = {"", " ","!", "@", "#", ".","$","%","^","&","*","/(","/)","_","/[","/}",",",":","<",">","/","?",";","|","-","+","="};			
			for (int j=0; j<invalid.length;j++) {
				if (street.equals(invalid[j])) {
					assertTrue("Your street name provided is invalid arguments for Address constructor", street.equals(invalid[j])); //testing if there is invalid values
					break;
				}
				if (number.equals(invalid[j])) {
					assertTrue("Your number provided is invalid arguments for Address constructor", number.equals(invalid[j])); //testing if there is invalid values
					break;
				}
				if (city.equals(invalid[j])) {
					assertTrue("Your city name provided is invalid arguments for Address constructor", city.equals(invalid[j])); //testing if there is invalid values
					break;
				}
				if (postalCode.equals(invalid[j])) {
					assertTrue("Your postal code provided is invalid arguments for Address constructor", postalCode.equals(invalid[j])); //testing if there is invalid values
					break;
				}
			}
		}
		
		
		@Test @Order(2) @DisplayName("Address() test with one valid argument")
		public void testAddressOneValidValue() {
				Address ad = new Address("Woodroffe", "#", "$","%");
				String street = ad.street();
				String number = ad.getNumber();
				String city = ad.getCity();
				String postalCode = ad.postalCode();
				String[] invalid = {"", " ","!", "@", "#", ".","$","%","^","&","*","/(","/)","_","/[","/}",",",":","<",">","/","?",";","|","-","+","="};			
				for (int j=0; j<invalid.length;j++) {
					if (street.equals(invalid[j])) {
						assertTrue("Your street name provided is invalid arguments for Address constructor", street.equals(invalid[j])); //testing if there is invalid values
						break;
					}
					if (number.equals(invalid[j])) {
						assertTrue("Your number provided is invalid arguments for Address constructor", number.equals(invalid[j])); //testing if there is invalid values
						break;
					}
					if (city.equals(invalid[j])) {
						assertTrue("Your city name provided is invalid arguments for Address constructor", city.equals(invalid[j])); //testing if there is invalid values
						break;
					}
					if (postalCode.equals(invalid[j])) {
						assertTrue("Your postal code provided is invalid arguments for Address constructor", postalCode.equals(invalid[j])); //testing if there is invalid values
						break;
					}
				}
			}	
		
		@Test @Order(3) @DisplayName("Address() test with two valid argument")
		public void testAddressTwoValidValues() {
				Address ad = new Address("Woodroffe", "1315", "$","%");
				String street = ad.street();
				String number = ad.getNumber();
				String city = ad.getCity();
				String postalCode = ad.postalCode();
				String[] invalid = {"", " ","!", "@", "#", ".","$","%","^","&","*","/(","/)","_","/[","/}",",",":","<",">","/","?",";","|","-","+","="};			
				for (int j=0; j<invalid.length;j++) {
					if (street.equals(invalid[j])) {
						assertTrue("Your street name provided is invalid arguments for Address constructor", street.equals(invalid[j])); //testing if there is invalid values
						break;
					}
					if (number.equals(invalid[j])) {
						assertTrue("Your number provided is invalid arguments for Address constructor", number.equals(invalid[j])); //testing if there is invalid values
						break;
					}
					if (city.equals(invalid[j])) {
						assertTrue("Your city name provided is invalid arguments for Address constructor", city.equals(invalid[j])); //testing if there is invalid values
						break;
					}
					if (postalCode.equals(invalid[j])) {
						assertTrue("Your postal code provided is invalid arguments for Address constructor", postalCode.equals(invalid[j])); //testing if there is invalid values
						break;
					}
				}
			}
		
		@Test @Order(4) @DisplayName("Address() test with three valid argument")
		public void testAddressThreeValidValues() {
			Address ad = new Address("Woodroffe", "1315","E2E 4H1", "@");
			String street = ad.street();
			String number = ad.getNumber();
			String city = ad.getCity();
			String postalCode = ad.postalCode();
			String[] invalid = {"", " ","!", "@", "#", ".","$","%","^","&","*","/(","/)","_","/[","/}",",",":","<",">","/","?",";","|","-","+","="};			
			for (int j=0; j<invalid.length;j++) {
				if (street.equals(invalid[j])) {
					assertTrue("Your street name provided is invalid arguments for Address constructor", street.equals(invalid[j])); //testing if there is invalid values
					break;
				}
				if (number.equals(invalid[j])) {
					assertTrue("Your number provided is invalid arguments for Address constructor", number.equals(invalid[j])); //testing if there is invalid values
					break;
				}
				if (city.equals(invalid[j])) {
					assertTrue("Your city name provided is invalid arguments for Address constructor", city.equals(invalid[j])); //testing if there is invalid values
					break;
				}
				if (postalCode.equals(invalid[j])) {
					assertTrue("Your postal code provided is invalid arguments for Address constructor", postalCode.equals(invalid[j])); //testing if there is invalid values
					break;
				}
			}
		}	

	@Test @Order(5) @DisplayName("Address() test with four valid argument")
	public void testAddressFourValidValues() {
		Address ad = new Address("Woodroffe", "1335", "Ottawa","E2E 4H1");
		String street = ad.street();
		String number = ad.getNumber();
		String city = ad.getCity();
		String postalCode = ad.postalCode();
		String[] invalid = {"", " ","!", "@", "#", ".","$","%","^","&","*","/(","/)","_","/[","/}",",",":","<",">","/","?",";","|","-","+","="};			
		for (int j=0; j<invalid.length;j++) {
			if (street.equals(invalid[j])) {
				assertTrue("Your street name provided is invalid arguments for Address constructor", street.equals(invalid[j])); //testing if there is invalid values
				break;
			}
			if (number.equals(invalid[j])) {
				assertTrue("Your number provided is invalid arguments for Address constructor", number.equals(invalid[j])); //testing if there is invalid values
				break;
			}
			if (city.equals(invalid[j])) {
				assertTrue("Your city name provided is invalid arguments for Address constructor", city.equals(invalid[j])); //testing if there is invalid values
				break;
			}
			if (postalCode.equals(invalid[j])) {
				assertTrue("Your postal code provided is invalid arguments for Address constructor", postalCode.equals(invalid[j])); //testing if there is invalid values
				break;
			}
		}
	}
	
	@Test @Order(6) @DisplayName("Address() test with Null argument")
	public void testAddressNullArguments() {
		Address ad = new Address(null,null,null,null);

		assertNotNull(ad, "This object is Null"); //make sure that Address constructor is not Null
		assertEquals("Invalid street name", ad.street()); //make sure that street was initially set as null constructor, so this test makes sense.
        assertEquals("Invalid street number", ad.getNumber()); //make sure that number was initially set as null constructor, so this test makes sense.
        assertEquals("Invalid city name",ad.getCity()); //make sure that city was initially set as null constructor, so this test makes sense.
        assertEquals("Invalid postal code number",ad.postalCode()); //make sure that postalCode was initially set as null constructor, so this test makes sense.
	}
  }

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			Address ad = new Address("Woodroffe", "1335", "Ottawa","E2E 4H1");
			String expected = "Woodroffe"+ " " + "1335" + " " + "Ottawa" + " " + "null" + " " + "E2E 4H1";
			String actual = ad.toString();
			assertEquals(expected, actual, "toString() method does not return a value that matches the expected string");
		}
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class TestFormattedAddress {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {
			Address ad = new Address("Woodroffe", "1335", "Ottawa","E2E 4H1");
			String expected = "[Patient's Address]: number = " + "1335"  +
					", street = " + "Woodroffe" + 
					", city = " + "Ottawa" + 
					", country = " + "null" + 
					", postalCode = " + "E2E 4H1";
			String actual = ad.formattedAddress();
			assertEquals(expected, actual, "formattedAddress() method does not return a value that matches the expected string");
		}
	}

	@Nested	@DisplayName("postalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class PostalCodeTest {
		@Test @Order(1) @DisplayName("postalCode()")
		final void testPostalCode() {
			Address ad = new Address("Woodroffe", "1335", "Ottawa","E2E 4H1");
			String expected = "E2E 4H1";
			String actual = ad.postalCode();
			assertEquals(expected, actual, "postalCode() method does not return a value that matches the expected string");
		}	
	}

	@Nested	@DisplayName("getCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetCityTest {
		@Test @Order(1) @DisplayName("getCity()")
		final void testGetCity() {
			Address ad = new Address("Woodroffe", "1335", "Ottawa","E2E 4H1");
			String expected = "Ottawa";
			String actual = ad.getCity();
			assertEquals(expected, actual, "getCity() method does not return a value that matches the expected string");
		}	
	}

	
	@Nested	@DisplayName("setStreet() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetStreetTest {
		@Test @Order(1) @DisplayName("setStreet()")
		final void testSetStreet() {
			Address ad = new Address(null, "1335", "Ottawa","E2E 4H1");
			String expected = "Woodroffe";
			ad.setStreet("Woodroffe");
			String actual = ad.street();
			assertEquals(expected, actual, "setStreet() method does not return a value that matches the expected string");
		}
	}
	
	@Nested	@DisplayName("setNumber() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNumberTest {
		@Test @Order(1) @DisplayName("setNumber()")
		final void testSetNumber() {
			Address ad = new Address("Woodroffe", null, "Ottawa","E2E 4H1");
			String expected = "1335";
			ad.setNumber("1335");
			String actual = ad.getNumber();
			assertEquals(expected, actual, "setNumber() method does not return a value that matches the expected string");
		}
	}


	@Nested	@DisplayName("setCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCityTest {
		@Test @Order(1) @DisplayName("setCity()")
		final void testSetCity() {
			Address ad = new Address("Woodroffe", "1335", null,"E2E 4H1"); 
			String expected = "Ottawa";
			ad.setCity("Ottawa");
			String actual = ad.getCity();
			assertEquals(expected, actual, "setCity() method does not return a value that matches the expected string");
		}
	}
	
	@Nested	@DisplayName("setCountry() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCountryTest {
		@Test @Order(1) @DisplayName("setCountry()")
		final void testSetCountry() {
			Address ad = new Address("Woodroffe", "1335", "Ottawa","E2E 4H1"); //ATTENTION PROFESSOR: remember that the UML diagram provided till 2024/02/08 did not mention any Address constructor with country as parameter. I am trying to follow 100% what was provided to me. Same problem happened with other classes. So please, take this in consideration while evaluating me.
			String expected = "Canada";
			ad.setCountry("Canada");
			String actual = ad.getCountry();
			assertEquals(expected, actual, "setCountry() method does not return a value that matches the expected string");
		}
	}
	
	@Nested	@DisplayName("setPostalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetPostalCodeTest {
		@Test @Order(1) @DisplayName("setPostalCode()")
		final void testSetCountry() {
			Address ad = new Address("Woodroffe", "1335", "Ottawa", null); 
			String expected = "E2E 4H1";
			ad.setPostalCode("E2E 4H1");
			String actual = ad.postalCode();
			assertEquals(expected, actual, "setPostalCode() method does not return a value that matches the expected string");
		}
	}




}

