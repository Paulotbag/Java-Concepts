
public class Generator {

	private String[] courseArray;
	private char grade1;
	private char grade2;
	private char grade3;
	private float gpa;
	
	
	
	public Generator() {
	this(null,'\u0000', '\u0000', '\u0000',0f);
	}
	
	public Generator(String[] courseArray,char grade1, char grade2, char grade3, float gpa) {
		this.courseArray=courseArray;
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
		this.gpa=gpa;
	}
	

}
