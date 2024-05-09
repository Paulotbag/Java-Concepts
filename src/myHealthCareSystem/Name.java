package myHealthCareSystem;

/**
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */
public class Name {

	
	
	/*	Attributes			************************************/
	private String first;
	private String last;
	private String middle;
	private String salutation;
	
	
	
	
	
	//Constructors - with overload		************************************/
	/**
	 * Default constructor for Name.
	 * @param 
	 */
	public Name() {
		this.first = null;
		this.last = null;
		this.middle = null;
	}
	
	
	/**
	 * Constructor for Name with single parameter.
	 * @param name -> string name must match the following syntax: "first_name + [space] + last_name".
	 */
	public Name(String name) {
		String arraySplit[] = name.split(" ", 2);
		this.first = arraySplit[0];   
		this.last = arraySplit[1];
	}
	
	/**
	 * Constructor for Name with two parameters.
	 * @param first -> string that represents first name.
	 * @param last -> string that represents last name.
	 */
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	/**
	 * Constructor for Name with three parameters.
	 * @param first -> string that represents first name.
	 * @param last -> string that represents last name.
	 * @param middle -> string that represents middle name
	 */
	public Name(String first, String last, String middle) {
		//////////////VALIDATES provided parameters///////////////////
		for (int i=0; i<1; i++) {
			String[] invalid = {"1","2","3","4","5","6","7","8","9","0","", " ","!", "@", "#", ".","$","%","^","&","*","/(","/)","_","/[","/}",",",":","<",">","/","?",";","|","-","+","="};
			for (int j=0; j<invalid.length;j++) {
				if (first == null || first == invalid[j]) {
					throw new IllegalArgumentException("Invalid input for first name");
		        }else {
		        	this.first = first;
		        }
				
				if (last == null || last == invalid[j]) {
					throw new IllegalArgumentException("Invalid input for last name");
		        } else {
		        	this.last = last;
		        }
				
				if (middle == null || middle == invalid[j]) {
					throw new IllegalArgumentException("Invalid input for middle name");
		        }else {
		        	this.middle = middle;
		        }
			}
		}
	}
	
	
	/*	Accessors			************************************/
	/**
	 * Get for first
	 * @return first -> string first, the attribute of class Name.
	 */
	public String first() {
		return this.first;
	}
	
	/**
	 * Get for last
	 * @return last -> string last, the attribute of class Name.
	 */
	public String last() {
		return this.last;
	}
	
	/**
	 * Get for middle //ATTENTION PROFESSOR: This method was not provided initially in any document till 2024/02/08. I created this one just for the JUnit test purpose just like many others in this assignment.
	 * @return middle -> string middle, the attribute of class Name.
	 */
	public String middle() {
		return this.middle;
	}
	
	public String salutation() {
		return this.salutation; //this method was not provided at the beginning. I had to do it for the JUnit Test
	}
	
	
	
	
	
	/* Modifiers			************************************/
	/**
	 * Set for first
	 * @param first -> the attribute of class Name.
	 */
	public void setFirst(String first) {
		this.first = first;
	}
	
	/**
	 * Set for last
	 * @param last -> the attribute of class Name.
	 */
	public void setLast(String last) {
		this.last = last;
	}
	
	/**
	 * Set for middle
	 * @param middle -> the attribute of class Name.
	 */
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	
	/**
	 * Set for salutation
	 * @param salutation -> the attribute of class Name.
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	
	
	
	
	/*	Normal Behavior	************************************/
	/**
	 * Override of toString() method
	 * @return information -> A string object showing Name attributes
	 */
	public String toString() {
		if (this.first == null) {
			
		}
		String information = /* "<" + getClass().getName() + ">: " + */
							"[First name= " + this.first +
							", Middle name= " + this.middle + 
							", Last name= " + this.last + "]";
		return information;
	}
	
	/**
	 * Gives a meaningful information to Name attributes in form of a String.
	 * @return a string following the format: salutation first middle last
	 */
	public String formattedName() {
		return this.salutation + " " + this.first + " " + this.middle + " " + this.last;
	}
	
	
	
	


}
