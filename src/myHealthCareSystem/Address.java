package myHealthCareSystem;

/**
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */
public class Address {

	
	/*	Attributes			************************************/
	private String street;
	private String number;
	private String city;
	private String country; 
	private String postalCode;
	
	
	
	/**
	 * Constructs Address - the patient street, number, city, and postalCode.
	 * @param street -> the street of the patient's address
	 * @param number -> the number of the patient's address
	 * @param city -> the city of the patient's address
	 * @param postalCode -> the postalCode of the patient's address
	 */
	/*	Constructors		************************************/
	public Address(String street, String number, String city, String postalCode) {
		//////////////VALIDATES provided parameters///////////////////
		for (int i=0; i<1; i++) {
			String[] invalid = {"", " ","!", "@", "#", ".","$","%","^","&","*","/(","/)","_","/[","/}",",",":","<",">","/","?",";","|","-","+","="};
			for (int j=0; j<invalid.length;j++) {
				if (street == null || street.equals(invalid[j])) {
		            this.street="Invalid street name";
		        }else {
		        	this.street=street;
		        }
				
				if (number == null || number.equals(invalid[j])) {
					this.number="Invalid street number";
		        } else {
		        	this.number=number;
		        }
				
				if (city == null || city.equals(invalid[j])) {
					this.city="Invalid city name";
		        }else {
		    		this.city=city;
		    		
		        }
				if (postalCode == null || postalCode.equals(invalid[j])) {
					this.postalCode="Invalid postal code number";
		        }else {
		    		this.postalCode=postalCode;
		        }
				
			}
		}
	}
	
	
	

	/*	Accessors			************************************/
	/**
	 * getCity()
	 * @return city -> return city as a String
	 */
	public String getCity() {
		return this.city;
	}
	
	/**
	 * street()
	 * @return street -> return street as a String
	 */
	public String street() {
		return this.street;
	}
	
	/**
	 * getNumber()
	 * return number -> return number as a String
	 */
	public String getNumber() {
		return this.number;
	}
	
	
	/**
	 * postalCode()
	 * @return postalCode -> return postalCode as a String
	 */
	public String postalCode() {
		return this.postalCode;
	}
	
	
	/**
	 * getCountry() //ATTENTION PROFESSOR: This method was not provided initially in any document till 2024/02/08. I created this one just for the JUnit test purpose just like many others in this assignment.
	 * @return country -> return country as a String
	 */
	public String getCountry() {
		return this.country;
	}

	
	

	/* Modifiers			************************************/
	/**
	 * Set for street
	 * @param street -> street name of the patient's address
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Set for number
	 * @param number -> number of the patient's address
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * Set for city
	 * @param city -> City name of the patient's address
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Set for country
	 * @param country -> Country name of the patient's address
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Set for postalCode
	 * @param postalCode -> postalCode of the patient's address
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	
	/*	Normal Behavior	************************************/

	/**
	 * override of toString() method
	 * @return A string object following the format: street + " " + number + " " + city + " " + country + " " + postalCode
	 */
	public String toString(){
		return street + " " + number + " " + city + " " + country + " " + postalCode;
	}
	
	/**
	 * Gives a meaningful information to Address attributes in form of a String.
	 * @return information -> This method return a String containing information of Address objects.
	 */
	public String formattedAddress() {
		String information = /* "<" + getClass().getName() + ">:" + */
				"[Patient's Address]: number = " + this.number  +
				", street = " + this.street + 
				", city = " + this.city + 
				", country = " + this.country + 
				", postalCode = " + this.postalCode;
		return information;
	}
	


}