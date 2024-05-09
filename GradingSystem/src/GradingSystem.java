// To Do: Programmer Comments

public class GradingSystem {
	private String courseName;
	private String letterGrade;
	public String[] percentArray = {"80-100","70-79","60-69","50-59","0-49"};
	public String[] numericArray = {"4.0","3.0","2.0","1.0","0.0"};
	public GradingSystem() {
		this("Not specified", "F");
	}

	public GradingSystem(String courseName, String letterGrade) {
		setCourseName(courseName);
		setLetterGrade(letterGrade);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	public void createReport() {
		String[] reportArray = {null,null};
		
		
		if (courseName.equals("ABC333") && letterGrade.equals("D")){
			reportArray[0] = percentArray[4];
			reportArray[1] = numericArray[4];
			System.out.print("Course " + courseName + ": Entered Grade " + letterGrade);
			System.out.print(", Actual Grade F" );
			System.out.print(", Percent Grade " + reportArray[0] + ", Number Grade " + reportArray[1]);
		}
		else if (letterGrade.equals("A")){
			reportArray[0] = percentArray[0];
			reportArray[1] = numericArray[0];
			System.out.print("Course " + courseName + ": Entered Grade " + letterGrade);
			System.out.print(", Percent Grade " + reportArray[0] + ", Number Grade " + reportArray[1]);
		}
		else if (letterGrade.equals("B")){
			reportArray[0] = percentArray[1];
			reportArray[1] = numericArray[1];
			System.out.print("Course " + courseName + ": Entered Grade " + letterGrade);
			System.out.print(", Percent Grade " + reportArray[0] + ", Number Grade " + reportArray[1]);
		}
		else if (letterGrade.equals("C")){
			reportArray[0] = percentArray[2];
			reportArray[1] = numericArray[2];
			System.out.print("Course " + courseName + ": Entered Grade " + letterGrade);
			System.out.print(", Percent Grade " + reportArray[0] + ", Number Grade " + reportArray[1]);
		}
		else if (letterGrade.equals("D")){
			reportArray[0] = percentArray[3];
			reportArray[1] = numericArray[3];
			System.out.print("Course " + courseName + ": Entered Grade " + letterGrade);
			System.out.print(", Percent Grade " + reportArray[0] + ", Number Grade " + reportArray[1]);
		}
		else if (letterGrade.equals("F")){
			reportArray[0] = percentArray[4];
			reportArray[1] = numericArray[4];
			System.out.print("Course " + courseName + ": Entered Grade " + letterGrade);
			System.out.print(", Percent Grade " + reportArray[0] + ", Number Grade " + reportArray[1]);
		}
		else {
			System.out.print("Invalid letter grade entered");
		}
	
		
		
	
	}

	}