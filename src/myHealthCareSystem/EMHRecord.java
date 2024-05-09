package myHealthCareSystem;



/*
 * 	W24	CST8284
 * 	Assignment 1: My Health System
 * 
 *		This is the start of a system which would maintain Electronic Medical Records for patients.
 *		This class assumes all values passed to the set methods are correct and valid.

 * 
 * 		Field values and constraints can be found in the Standards guide
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024).
 * 
 */


/**
 * @author Paulo Ricardo Gomes Granjeiro
 * Student Number: 041118057
 * @version java version "21.0.1" 2023-10-17 LTS
 * @since javac 21.0.1
 */
public class EMHRecord {
	
	//attributes
	private String reportingFacilityProvince; //Valid data: {NL, PE, NS, NB, QC, ON, MB, SK, AB, BC, YT, NT, NU}
	private String institutionNumber; //Valid data: {0,1,2,3,4,5,6,7,8,9,Y,N,V,I}
	private String functionalCentreAccount; //Valid data: 7 characters starting with '7*'. Recommended to check Appendix B in the Standards guide
	private int encounterSequence; //Valid data: {001–999 or blank}
	private String healthCareNumber; //Valid data: {0,1,8,9}
	private String chartNumber; //Valid data: {0 to 9, A to Z}
	private String issuingProvince; //Valid data: {NL, PE, NS, NB, QC, ON, MB, SK, AB, BC, YT, NT, NU, 99, CA}
	private String residenceCode; //Valid data: {NL, PE, NS, NB, QC, ON, MB, SK, AB, BC, YT, NT, NU, or BLANK}
	private String gender; //Valid data: {M,F,U,O}
	private int submissionYear; //Valid data: Valid fiscal year (YYYY)
	private String adminViaAmbulance; //Valid data: {A, G, C, N }
	private int registrationDate; //Valid data: {YYYYMMDD}
	private int registrationTime; //Valid data: {HHMM}
	private BirthDate birthDate; //Valid data: (int year, int month, int day)
	
	
	
	
	
	/**
	 * Constructs EMHRecord - relevant information of the E. Medical Health.
	 * @param reportingFacilityProvince -> the reportingFacilityProvince of E. Medical Health
	 * @param institutionNumber -> the institutionNumber of E. Medical Health
	 * @param chartNumber -> the chartNumber of E. Medical Health
	 * @param healthCareNumber -> the healthCareNumber of E. Medical Health
	 */
	//constructor
	public EMHRecord(String reportingFacilityProvince, String institutionNumber, String chartNumber, String healthCareNumber) {
		for (int i=0; i<1; i++) {
			String[] validRFP = {"NL","PE","NS","NB","QC","ON","MB","SK","AB","BC","YT", "NT","NU"};
			String[] validIN = {"1","2","3","4","5","6","7","8","9","0","Y", "N","V", "I"};
			String[] validCN = {"1","2","3","4","5","6","7","8","9","0","A", "B","C", "D", "E", "F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","W","Z"};
			String[] validHCN = {"1","8","9","0"};
			boolean isValidRFP = false;
			boolean isValidIN = false;
			boolean isValidCN = false;
			boolean isValidHCN = false;
			//////////////VALIDATES reportingFacilityProvince///////////////////
			for (int j=0; j<validRFP.length;j++) {
			    if (reportingFacilityProvince != null && reportingFacilityProvince.equals(validRFP[j])) {
			        isValidRFP = true;
			        break;
			    }
			}
			if (!isValidRFP) {
			    throw new IllegalArgumentException("Invalid input for reportingFacilityProvince");
			} else {
			    this.reportingFacilityProvince = reportingFacilityProvince;   
			}
			//////////////VALIDATES institutionNumber///////////////////
			for (int j=0; j<validIN.length;j++) {
			    if (institutionNumber != null && institutionNumber.equals(validIN[j])) {
			    	isValidIN = true;
			        break;
			    }
			}
			
			if (!isValidIN) {
				throw new IllegalArgumentException("Invalid input for institutionNumber");
	        } else {
	        	this.institutionNumber = institutionNumber;
	        }
			//////////VALIDATES chartNumber///////////
			for (int j=0; j<validCN.length;j++) {
			    if (chartNumber != null && chartNumber.equals(validCN[j])) {
			    	isValidCN = true;
			        break;
			    }
			}
			
			if (!isValidCN) {
				throw new IllegalArgumentException("Invalid input for chartNumber");
	        }else {
	        	this.chartNumber = chartNumber;
	        }
			//////////VALIDATES healthCareNumber///////////
			for (int j=0; j<validHCN.length;j++) {
			    if (healthCareNumber != null && healthCareNumber.equals(validHCN[j])) {
			    	isValidHCN = true;
			        break;
			    }
			}
			
			if (!isValidHCN) {
				throw new IllegalArgumentException("Invalid input for healthCareNumber");
	        }else {
	        	this.healthCareNumber = healthCareNumber;
	        }
			
		}
		
	}

	
	
	
	
	//accessors
	/**
	 * getFunctionalCentreAccount()
	 * @return functionalCentreAccount -> return functionalCentreAccount as a String
	 */
	public String getFunctionalCentreAccount() {
		return functionalCentreAccount;
	}

	/**
	 * getEncounterSequence()
	 * @return encounterSequence -> return encounterSequence as an integer
	 */
	public int getEncounterSequence() {
		return encounterSequence;
	}

	/**
	 * getIssuingProvince()
	 * @return issuingProvince -> return issuingProvince as a String
	 */
	public String getIssuingProvince() {
		return issuingProvince;
	}

	/**
	 * getResidenceCode()
	 * @return residenceCode -> return residenceCode as a String
	 */
	public String getResidenceCode() {
		return residenceCode;
	}

	/**
	 * getGender()
	 * @return gender -> return gender as a String
	 */
	public String getGender() {
		return this.gender;
	}

	/**
	 * getSubmissionYear()
	 * @return submissionYear -> return submissionYear as an integer
	 */
	public int getSubmissionYear() {
		return submissionYear;
	}

	/**
	 * getAdminViaAmbulance()
	 * @return adminViaAmbulance -> return adminViaAmbulance as a String
	 */
	public String getAdminViaAmbulance() {
		return adminViaAmbulance;
	}

	/**
	 * getRegistrationDate()
	 * @return registrationDate -> return registrationDate as an integer
	 */
	public int getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * getRegistrationTime()
	 * @return registrationTime -> return registrationTime as an integer
	 */
	public int getRegistrationTime() {
		return registrationTime;
	}
	
	/**
	 * getBirthDate()
	 * @return birthDate -> return object birthDate of class BirthDate
	 */
	public BirthDate getBirthDate() {
		return this.birthDate;
	}
	
	
	
	
	//modifiers
	/**
	 * Set for functionalCentreAccount
	 * @param functionalCentreAccount -> String functionalCentreAccount //Valid data: string of 7 characters starting with '7*'. Recommended to check Appendix B in the Standards guide
	 */
	public void setFunctionalCentreAccount(String functionalCentreAccount) {
		this.functionalCentreAccount = functionalCentreAccount;
	}

	
	/**
	 * Set for encounterSequence
	 * @param encounterSequence -> integer encounterSequence //Valid data: {001–999 or blank}
	 */	
	public void setEncounterSequence(int encounterSequence) {
		this.encounterSequence = encounterSequence;
	}

	/**
	 * Set for issuingProvince
	 * @param issuingProvince -> String issuingProvince //Valid data: {NL, PE, NS, NB, QC, ON, MB, SK, AB, BC, YT, NT, NU, 99, CA}
	 */	
	public void setIssuingProvince(String issuingProvince) {
		this.issuingProvince = issuingProvince;
	}

	/**
	 * Set for residenceCode
	 * @param residenceCode -> String residenceCode //Valid data: {NL, PE, NS, NB, QC, ON, MB, SK, AB, BC, YT, NT, NU, or BLANK}
	 */
	public void setResidenceCode(String residenceCode) {
		this.residenceCode = residenceCode;
	}

	/**
	 * Set for gender
	 * @param gender -> String gender //Valid data: {M,F,U,O}
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Set for setSubmissionYear
	 * @param setSubmissionYear -> Integer setSubmissionYear //Valid data: Valid fiscal year (YYYY)
	 */
	public void setSubmissionYear(int submissionYear) {
		this.submissionYear = submissionYear;
	}

	/**
	 * Set for adminViaAmbulance
	 * @param adminViaAmbulance -> String adminViaAmbulance //Valid data: {A, G, C, N }
	 */
	public void setAdminViaAmbulance(String adminViaAmbulance) {
		this.adminViaAmbulance = adminViaAmbulance;
	}

	/**
	 * Set for registrationDate
	 * @param registrationDate -> Integer registrationDate //Valid data: {YYYYMMDD}
	 */
	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * Set for registrationTime
	 * @param registrationTime -> Integer registrationTime //Valid data: {HHMM}
	 */
	public void setRegistrationTime(int registrationTime) {
		this.registrationTime = registrationTime;
	}
	
	/**
	 * Set for birthDate
	 * @param birthDate -> Objects from BirthDate class //Valid data: (int year, int month, int day)
	 */
	public void setBirthDate(BirthDate birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
	
	
	
	//normal behavior
	/**
	 * override of toString() method
	 * @return information -> A string with information of EMHRecord objects
	 */
	public String toString() {

		String information = /*"<" + EMHRecord.class.getName() + ">:" + */ 
							"[reportingFacilityProvince = " + this.reportingFacilityProvince + 
							", institutionNumber = " + this.institutionNumber + 
							", chartNumber = " + this.chartNumber + 
							", healthCareNumber = " + this.healthCareNumber + "]";
		return information;
	}
	
	/**
	 * giving a meaningful information to birthDate attributes in form of a String.
	 * @return A meaningful string of birthDate attribute.
	 * @see BirthDate Class.
	 */
	public String formattedBirthDate()	{
		return this.birthDate.formattedBirthDate();
	}

}

