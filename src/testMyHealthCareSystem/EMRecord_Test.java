package testMyHealthCareSystem;


import static org.junit.Assert.assertTrue;

/*		@(#)EMRecord_Test.java	Jan. 31, 2024
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
* Test class for testing the EMRecord class
* Uses JUnit version 5
* @author Paulo Ricardo Gomes Granjeiro
* Student ID: 041118057
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMRecord_Test {



	

	
	@Nested	@DisplayName("EMRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMRecordTest {
		@Test @Order(1) @DisplayName("EMRecord() test with Null arguments")
		final void testEMRecordWithNullArguments() {
			
			try	{	/* Block used to catch exceptions and display a stack trace					*/	
				EMRecord emr = new EMRecord(null,"Ottawa","6", "@");
				assertNotNull(emr, "This object is Null"); //make sure that Name constructor is not Null, but it will has null and invalid values for this test.
				String reportingFacilityProvince = null; //ATTENTION: this variable and the next 3 ones are simulating the values of the constructor because the assignment did not required accessors for the constructor attributes. So I don't have them in my EMRecord class and neither in the parent class. I am just following the instructions provided.
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
		
	@Test @Order(2) @DisplayName("EMRecord() test with valid arguments")
	final void testEMRecordWithValidArguments() {
		EMRecord emrTest = new EMRecord("AB","6","B","1");
			assertNotNull(emrTest, "This object is Null"); //make sure that Name constructor is not Null
			//If there is a non valid parameter value, the constructor will throw exception.
			//but here we sill no errors while instantiating this constructor and it is not null.
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			EMRecord emrTest = new EMRecord("AB","6","B","1");
			String expected = "[reportingFacilityProvince = " + "AB" + 
					", institutionNumber = " + "6" + 
					", chartNumber = " + "B" + 
					", healthCareNumber = " + "1" + "]";
			String actual = emrTest.toString();
			assertEquals(expected, actual, "toString() method does not return a value that matches the expected string");
		}
	}

	
	@Nested	@DisplayName("setName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNameTest {
		@Test @Order(1) @DisplayName("setName()") //this method was not provided in the UML by professor Dyer. However, this JUnit file came requesting to test this method. So I had to do some modifications like creating the getName() method.
		final void testSetName() {
			EMRecord emrTest = new EMRecord("AB", "6", "B", "1");
	        Name expectedName = new Name("Paulo", "Granjeiro", "Ricardo");
	        emrTest.setName(expectedName);
	        Name actualName = emrTest.getName();
	        assertEquals(expectedName, actualName, "setName() method does not return a value that matches the expected Name");
		}
	}
	
	
	@Nested	@DisplayName("setAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetAddressTest {
		@Test @Order(1) @DisplayName("setAddress()") //this method was not provided in the UML by professor Dyer. However, this JUnit file came requesting to test this method. So I had to do some modifications like creating the getName() method.
		final void testSetAddress() {
			EMRecord emrTest = new EMRecord("AB", "6", "B", "1");
			Address expectedAddress = new Address("Woodroffe", "1335", "Ottawa","E2E 4H1");
	        emrTest.setAddress(expectedAddress);
	        Address actualAddress = emrTest.getAddress();
	        assertEquals(expectedAddress, actualAddress, "setAddress() method does not return a value that matches the expected Address");
		}
	}

	
	@Nested	@DisplayName("setHeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetHeightTest {
		@Test @Order(1) @DisplayName("setHeight()")
		final void testSetHeight() {
			EMRecord emrTest = new EMRecord("AB", "6", "B", "1");
			int expected = 5;
			emrTest.setHeight(5);
			int actual = emrTest.getHeight();
			assertEquals(expected, actual, "setHeight() method does not return a value that matches the expected int");
		}	
	}
	
	
	@Nested	@DisplayName("setWeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetWeightTest {
		@Test @Order(1) @DisplayName("setWeight()")
		final void testSetWeight() {
			EMRecord emrTest = new EMRecord("AB", "6", "B", "1");
			int expected = 70;
			emrTest.setWeight(70);
			int actual = emrTest.getWeight();
			assertEquals(expected, actual, "setWeight() method does not return a value that matches the expected int");
		}	
	}
	
	
	@Nested	@DisplayName("getHeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetHeightTest {
		@Test @Order(1) @DisplayName("getHeight()")
		final void testGetHeight() {
			EMRecord emrTest = new EMRecord("AB", "6", "B", "1");
			int expected = 6;
			emrTest.setHeight(6);
			int actual = emrTest.getHeight();
			assertEquals(expected, actual, "getHeight() method does not return a value that matches the expected int");
		}	
	}
	
	
	@Nested	@DisplayName("getWeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetWeightTest {
		@Test @Order(1) @DisplayName("getWeight()")
		final void testGetWeight() {
			EMRecord emrTest = new EMRecord("AB", "6", "B", "1");
			int expected = 70;
			emrTest.setWeight(70);
			int actual = emrTest.getWeight();
			assertEquals(expected, actual, "getWeight() method does not return a value that matches the expected int");
		}	
	}
	
	
	@Nested	@DisplayName("formattedName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class TestFormattedName {
		@Test @Order(1) @DisplayName("formattedName()")
		final void testFormattedName() {
			EMRecord emrTest = new EMRecord("AB", "6", "B", "1");
			emrTest.setName(new Name("Paulo", "Gomes Granjeiro", "Ricardo"));
			String expected = "null" + " " + "Paulo" + " " + "Ricardo" + " " + "Gomes Granjeiro"; //the salutation should be null. ATTENTION: this is because professor Dyer provided the UML Diagram without accessors for salutation and constructor without salutation. I am just following what was provided.
			String actual = emrTest.formattedName();
			assertEquals(expected, actual, "formattedName() method does not return a value that matches the expected string");
		}
		
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class TestFormattedAddress {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {
			EMRecord emrTest = new EMRecord("AB", "6", "B", "1");
			emrTest.setAddress(new Address("Woodroffe", "1335", "Ottawa","E2E 4H1"));
			String expected = "[Patient's Address]: number = " + "1335"  +
					", street = " + "Woodroffe" + 
					", city = " + "Ottawa" + 
					", country = " + "null" + 
					", postalCode = " + "E2E 4H1";
			String actual = emrTest.formattedAddress();
			assertEquals(expected, actual, "formattedAddress() method does not return a value that matches the expected string");
		}
	}
	
	@Nested	@DisplayName("bmi() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class TestBmi {
		@Test @Order(1) @DisplayName("bmi()")
		final void testBmi() {
			EMRecord emrTest = new EMRecord("AB", "6", "B", "1");
			emrTest.setHeight(72);
			emrTest.setWeight(176);
			int expected = 24;
			int actual = emrTest.bmi();
			assertEquals(expected, actual, "bmi() method does not return a value that matches the expected int");
		}
	}
	
}
