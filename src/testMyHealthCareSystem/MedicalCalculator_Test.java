package testMyHealthCareSystem;


/*		@(#)MedicalCalculator_Test.java	Jan. 31, 2024
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
* Test class for testing the MedicalCalculator class
* Uses JUnit version 5
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
* @version 1.0.0
*/

@DisplayName("Test My HealthCare Application Domain")
@TestMethodOrder(OrderAnnotation.class)
public class MedicalCalculator_Test {

	
	@Nested	@DisplayName("calculateBMI() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class calculateBMITest {

		@Test @Order(1) @DisplayName("calculateBMI() test with Null arguments")
		final void testCalculateBMIWithNullArguments() {
			double result = MedicalCalculator.calculateBMI(0.0, 0.0);
			System.out.println("calculateBMI() ->BMI:" + result);
			assertEquals(result,0);
		}
		
		@Test @Order(2) @DisplayName("calculateBMI() test with height = 0")
		final void testCalculateBMIWithHeightZero() {
			double result = MedicalCalculator.calculateBMI(165, 0);
			System.out.println("calculateBMI(165,0) ->BMI:" + result);
			assertEquals(result,0);
		}

		@Test @Order(3) @DisplayName("calculateBMI() test with weight = 0")
		final void testCalculateBMIWithWeightZero() {
			double result = MedicalCalculator.calculateBMI(0, 69);
			System.out.println("calculateBMI(0,69) ->BMI:" + result);
			assertEquals(result,0);
		}

		@Test @Order(4) @DisplayName("calculateBMI() test with valid arguments") //this method must check for incorrect calculation of BMI.
		final void testCalculateBMIWithValidArguments() {
			double result = MedicalCalculator.calculateBMI(165, 69);
			System.out.println("calculateBMI(165,69) ->BMI:" + result);
			assertEquals(result,24.4);
		}
		
		@Test @Order(1) @DisplayName("incorrectBMI() test with valid arguments") //this method must check for incorrect calculation of BMI.
		final void testIncorrectBMIWithValidArguments() {
			double result = MedicalCalculator.incorrectBMI(165, 69);
			System.out.println("incorrectBMI(165,69) ->BMI:" + result);
			assertEquals(result,MedicalCalculator.calculateBMI(165, 69), "The expected result does not match the actual value of BMI. If the value is negative when using positive Height and Weight, there might be wrong negative constant in the method that calculates BMI");
		}


	}

	
}
