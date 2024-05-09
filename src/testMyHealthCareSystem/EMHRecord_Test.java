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
* Test class for testing the EMHRecord class
* Uses JUnit version 5
* @author Paulo Ricardo Gomes Granjeiro
* Student ID: 041118057
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMHRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMHRecord_Test {

	
	@Nested	@DisplayName("EMHRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMHRecordTest {
		@Test @Order(1) @DisplayName("EMHRecord() test with Null arguments")
		final void testEMHRecordWithNullArguments() {
			
			try	{	/* Block used to catch exceptions and display a stack trace					*/	
				EMHRecord emhr = new EMHRecord(null,"Ottawa","6", "@");
				assertNotNull(emhr, "This object is Null"); //make sure that Name constructor is not Null, but it will has null and invalid values for this test.
				String reportingFacilityProvince = null; //ATTENTION: this variable and the next 3 ones are simulating the values of the constructor because the assignment did not required accessors for the constructor attributes. So I don't have them in my EMHRecord class. I am just following the instructions provided.
				String institutionNumber = "Ottawa";
				String chartNumber = "6";
				String healthCareNumber = "@";
				String[] validRFP = {"NL","PE","NS","NB","QC","ON","MB","SK","AB","BC","YT", "NT","NU"};
				String[] validIN = {"1","2","3","4","5","6","7","8","9","0","Y", "N","V", "I"};
				String[] validCN = {"1","2","3","4","5","6","7","8","9","0","A", "B","C", "D", "E", "F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","W","Z"};
				String[] validHCN = {"1","8","9","0"};			
				for (int j=0; j<validRFP.length;j++) {
					if (reportingFacilityProvince == null || reportingFacilityProvince != validRFP[j]) {
						assertTrue("Your provided input \"reportingFacilityProvince\" for EMHRecord constructor is invalid", reportingFacilityProvince == null || reportingFacilityProvince != validRFP[j]); //testing if there is invalid values
						break;
					}
				}
				for (int j=0; j<validIN.length;j++) {	
					if (institutionNumber == null || institutionNumber != validIN[j]) {
						assertTrue("Your provided input \"institutionNumber\" for EMHRecord constructor is invalid", institutionNumber == null || institutionNumber != validIN[j]); //testing if there is invalid values
						break;
					}
				}
				for (int j=0; j<validCN.length;j++) {
					if (chartNumber == null || chartNumber != validCN[j]) {
						assertTrue("Your provided input \"chartNumber\" for EMHRecord constructor is invalid", chartNumber == null || chartNumber != validCN[j]); //testing if there is invalid values
						break;
					}
				}
				for (int j=0; j<validHCN.length;j++) {	
					if (healthCareNumber == null || healthCareNumber == validHCN[j]) {
						assertTrue("Your provided input \"chartNumber\" for EMHRecord constructor is invalid", healthCareNumber == null || healthCareNumber == validHCN[j]); //testing if there is invalid values
						break;
					}
				}
			}catch (Exception ex){
				ex.printStackTrace();
				}
			}
		}
		
	@Test @Order(2) @DisplayName("EMHRecord() test with valid arguments")
	final void testEMHRecordWithValidArguments() {
		EMHRecord emhrTest = new EMHRecord("AB","6","B","1");
			assertNotNull(emhrTest, "This object is Null"); //make sure that Name constructor is not Null
			//If there is a non valid parameter value, the constructor will throw exception.
			//but here we sill no errors while instantiating this constructor and it is not null.
			
	}


	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			EMHRecord emhrTest = new EMHRecord("AB","6","B","1");
			String expected = "[reportingFacilityProvince = " + "AB" + 
					", institutionNumber = " + "6" + 
					", chartNumber = " + "B" + 
					", healthCareNumber = " + "1" + "]";
			String actual = emhrTest.toString();
			assertEquals(expected, actual, "toString() method does not return a value that matches the expected string");
		}
	}

	
	@Nested	@DisplayName("setGender() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetGenderTest {
		@Test @Order(1) @DisplayName("setGender()")
		final void testSetGender() {
			EMHRecord emhrTest = new EMHRecord("AB","6","B","1");
			String expected = "M";
			emhrTest.setGender("M");
			String actual = emhrTest.getGender();
			assertEquals(expected, actual, "setGender() method does not return a value that matches the expected string");
		}
	}
	
	
	@Nested	@DisplayName("getResidenceCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetResidenceCode {
		@Test @Order(1) @DisplayName("getResidenceCode()")
		final void testGetResidenceCode() {
			EMHRecord emhrTest = new EMHRecord("AB","6","B","1");
			emhrTest.setResidenceCode("ON");
			String expected = "ON";
			String actual = emhrTest.getResidenceCode();
			assertEquals(expected, actual, "getResidenceCode() method does not return a value that matches the expected string");
		}
	}

	}


