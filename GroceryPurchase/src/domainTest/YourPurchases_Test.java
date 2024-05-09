package domainTest;

/*		@(#)YourPurchases_Test.java Feb. 05, 2024
*
*/


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import domain.*;


/**
 * Test class for testing the YourPurchases class
 * Uses JUnit version 5
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version 1.0.0
 */
@DisplayName("Test Customer Application Domain")
@TestMethodOrder(OrderAnnotation.class)
class YourPurchases_Test {
	YourPurchases purchases = new YourPurchases();
	@BeforeEach
	void setUp() throws Exception {
		purchases.setPayment(0.0);
		purchases.setPurchase(0.0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		purchases.setPayment(0.0);
		purchases.setPurchase(0.0);
	}

	
	@Nested @DisplayName("create Test") @TestMethodOrder(OrderAnnotation.class)
	class ConstructorTest {
		@Test @Order(1) @DisplayName("create Test")
		final void testCustomerCreate() {
			try	{	/* Block used to catch exceptions and display a stack trace					*/
				YourPurchases purchases = new YourPurchases();
				assertNotNull(purchases); /* Asserts that an object isn't null */
				System.out.println(purchases);

			} catch (Exception ex)	{
				ex.printStackTrace();
			}
		}
	}
	
	
	
	@Nested	@DisplayName("recordPurchase() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class recordPurchaseTest {

		@Test @Order(1) @DisplayName("recordPurchase() test with Null arguments")
		final void testRecordPurchaseWithNullArguments() {
			YourPurchases purchases = new YourPurchases();
			double exptValue = 0;
			purchases.recordPurchase(-10.5);
			double actValue = purchases.getPurchase();
			assertEquals(exptValue, actValue, "recordPurchase() returned a value that does not match the expected one.");
		}
		
		@Test @Order(2) @DisplayName("recordPurchase() test with valid arguments")
		final void testRecordPurchaseWithValidArguments() {
		YourPurchases purchases = new YourPurchases();
		double expectedResult = 20;
		purchases.recordPurchase(20);
		double actualdResult = purchases.getPurchase();
		assertEquals(expectedResult,actualdResult,0.1);
		}

	}

	
	
	@Nested	@DisplayName("receivePayment() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ReceivePaymentTest {
	
		@Test @Order(1) @DisplayName("receivePayment() test with Null arguments")
		final void testReceivePaymentWithNullArguments() {
		YourPurchases purchase = new YourPurchases();
		double exptValue = 0.0;
		purchase.receivePayment(-2, -2, -2, -2, -2);
		double actValue = purchase.getPayment();
		assertEquals(exptValue, actValue, "receivePayment() actual value does not match the expected one.");
		}
		@Test @Order(2) @DisplayName("receivePayment() test with Valid arguments")
		final void testReceivePaymentWithValidArguments() {
		YourPurchases purchase = new YourPurchases();
		double exptValue = 1.41;
		purchase.receivePayment(1, 1, 1, 1, 1);
		double actValue = purchase.getPayment();
		assertEquals(exptValue, actValue, 0.01, "receivePayment() actual value does not match the expected one.");
		}
		
	}

	
	@Nested	@DisplayName("giveChange() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GiveChangeTest {
	
	
		@Test @Order(1) @DisplayName("giveChange() test with No arguments") //as requested by teacher Nicole, just do this one.
		final void testGiveChange() {
			YourPurchases purchases = new YourPurchases();
			double testPayment = 0.00;
			double testPurchase = 0.00;
			double expectedValue = testPayment - testPurchase; //(0-0=0)
			double actualValue = purchases.giveChange(); //Default constructor has 0 values for payment and purchase
			assertEquals(expectedValue,actualValue,0.01);
		}
		
		
	}

	
	
}	/*	End of test classes					*/

