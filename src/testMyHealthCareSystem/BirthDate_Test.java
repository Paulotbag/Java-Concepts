package testMyHealthCareSystem;




import static org.junit.Assert.assertEquals;
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
@DisplayName("Test My HealthCare Application Domain - BirthDate")
@TestMethodOrder(OrderAnnotation.class)
public class BirthDate_Test {


	
	@Nested	@DisplayName("BirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class BirthDateTest {
		@Test @Order(1) @DisplayName("BirthDate() test with invalid arguments")
		final void testBirthDateWithNullArguments() {
			BirthDate bd = new BirthDate(-2024,14,-1);
			int expectedYear = 1900;
			int expectedMonth = 1;
			int expectedDay = 1;
			int actualYear = bd.getYear();
			int actualMonth = bd.getMonth();
			int actualDay = bd.getDay();
			assertNotNull(bd, "This object is Null"); //make sure BirthDate instance is not null.
			assertEquals(expectedYear, actualYear); //make sure year has a valid value. If user puts invalid year, year will be set to 1900.
			assertEquals(expectedMonth, actualMonth);  //make sure month has a valid value
			assertEquals(expectedDay, actualDay);  //make sure day has a valid value
		}
		@Test @Order(2) @DisplayName("BirthDate() test with valid arguments")
		final void testBirthDateWithValidArguments() {
			BirthDate bd = new BirthDate(2013,4,20);
			int expectedYear = 2013;
			int expectedMonth = 4;
			int expectedDay = 20;
			int actualYear = bd.getYear();
			int actualMonth = bd.getMonth();
			int actualDay = bd.getDay();
			assertNotNull(bd, "This object is Null"); //make sure BirthDate instance is not null.
			assertEquals(expectedYear, actualYear); //make sure year value matches the expected
	        assertEquals(expectedMonth, actualMonth);  //make sure month value matches the expected
	        assertEquals(expectedDay, actualDay);  //make sure day value matches the expected
		}
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			BirthDate bd = new BirthDate(2013,4,20);
			String expected = "[year= " + "2013" + ", month= " + "4" + ", day= " + "20" + "]";
			String actual = bd.toString();
			assertEquals("toString() method does not return a value that matches the expected string", expected, actual);
		}	
	}
	
	@Nested	@DisplayName("formattedBirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedBirthDate {
		@Test @Order(1) @DisplayName("formattedBirthDate()")
		final void testFormattedBirthDate() {
			BirthDate bd = new BirthDate(2013,4,20);
			String expected = "2013/4/20";
			String actual = bd.formattedBirthDate();
			assertEquals("formattedBirthDate() method does not return a value that matches the expected string",expected, actual);
		}
		
	}

	@Nested	@DisplayName("getDay() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetDayTest {
		@Test @Order(1) @DisplayName("getDay()")
		final void testGetDay() {
			BirthDate bd = new BirthDate(2013,4,20);
			int expected = 20;
			int actual = bd.getDay();
			assertEquals(expected, actual, "getDay() method does not return a value that matches the expected integer");
		}		
	}
	
	@Nested	@DisplayName("getMonth() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetMonthTest {
		@Test @Order(1) @DisplayName("getMonth()")
		final void testGetMonth() {
			BirthDate bd = new BirthDate(2013,4,20);
			int expected = 4;
			int actual = bd.getMonth();
			assertEquals(expected, actual, "getMonth() method does not return a value that matches the expected integer");
		}	
	}
	
	@Nested	@DisplayName("getYear() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetYearTest {
		@Test @Order(1) @DisplayName("getYear()")
		final void testGetYear() {
			BirthDate bd = new BirthDate(2013,4,20);
			int expected = 2013;
			int actual = bd.getYear();
			assertEquals(expected, actual, "getYear() method does not return a value that matches the expected integer");
		}
	}

}

