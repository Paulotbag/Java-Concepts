package myHealthCareSystem;


/*
 * 	W24	CST8284
 * 	Assignment 1: My Health System
 * 
 *		This is the start of a system which would maintain Electronic Medical Records for patients.
 *		This class assumes all values passed to the set methods are correct and valid.
 * 
 * 		Field values and constraints can be found in the Standards guide
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024)
 * 
 */

/**
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */
public class EMRecord extends EMHRecord		{

	
	
	/*	Attributes			************************************/
	private int height; //Valid data: 0.1–9999.9 or blank [inches]
	private int weight; //Valid data: 0.001–999.999 or blank [pounds]
	private Name name; //Valid data: {(String firstname+space+lastname);(String first, String last);(String first, String last, String middle)}
	private Address address; //Valid data: (String street, String number, String city, String postalCode)
	
	
	/**
	 * Constructs EMRecord - relevant information of the E. Medical Health. This constructor inherits parameters from
	 * its parent class EMHRecord constructor.
	 * @see EMHRecord Class.
	 * @param reportingFacilityProvince -> the reportingFacilityProvince of E. Medical Health
	 * @param institutionNumber -> the institutionNumber of E. Medical Health
	 * @param chartNumber -> the chartNumber of E. Medical Health
	 * @param healthCareNumber -> the healthCareNumber of E. Medical Health
	 */
	/*	Constructors		************************************/
	public EMRecord(String reportingFacilityProvince, String institutionNumber, String chartNumber, String healthCareNumber) {
		super(reportingFacilityProvince, institutionNumber, chartNumber, healthCareNumber);
		
	}
	
	
	
	/*	Accessors			************************************/
	/**
	 * getHeight()
	 * @return height -> integer height attribute of class EMRecord.
	 */
	public int getHeight() {
		return this.height;
	}
	
	/**
	 * getWeight()
	 * @return weight -> integer weight attribute of class EMRecord.
	 */
	public int getWeight() {
		return this.weight;
	}
	
	/**
	 * getName()
	 * @return name -> Name object attribute of class EMRecord.
	 */
	public Name getName() {
		return this.name;
	}
	
	/**
	 * getAddress()
	 * @return address -> Address object attribute of class EMRecord.
	 */
	public Address getAddress() {
		return this.address;
	}
	
	
	/* Modifiers			************************************/
	/**
	 * Set for name
	 * @param name -> Object name from class Name.
	 * @see Name Class.
	 */
	public void setName(Name name) {
		this.name = name;
	}
	
	/**
	 * Set for address
	 * @param address -> Object address from class address. //Valid data: (String street, String number, String city, String postalCode)
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * Set for height
	 * @param height -> integer height attribute of class EMRecord
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * Set for weight
	 * @param weight -> integer weight attribute of class EMRecord
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
	
	/*	Normal Behavior	************************************/
	/**
	 * override of toString() method
	 * @return toString() from class EMHRecord
	 * @see EMHRecord Class.
	 */
	public String toString() {
		return super.toString();
	}
	
	/**
	 * giving a meaningful information to name attributes in form of a String.
	 * @return A meaningful string of name attribute.
	 * @see Name Class.
	 */
	public String formattedName() {
		return this.name.formattedName();
	}
	
	/**
	 * giving a meaningful information to address attributes in form of a String.
	 * @return A meaningful string of address attribute.
	 * @see Address Class.
	 */
	public String formattedAddress() {
		return this.address.formattedAddress();
	}
		
	
	/*	Helper Methods		************************************/
	
	/**
	 * This method returns the calculated Body Mass Index (BMI) from weight and height provided.
	 * @return integer value of patient's Body Mass Index.
	 * @see MedicalCalculator Class.
	 */
	public int bmi() {
		double weight1  = this.weight;
		double height1  = this.height;
		return (int) Math.round(MedicalCalculator.calculateBMI(weight1, height1));
	}
	

    
}

