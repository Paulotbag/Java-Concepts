//THE OBJECTIVE IS TO GENERATE A .txt FILE WITH RANDOM GRADINGS FOR EACH COURSE FOR EACH STUDENTS. 
//THE CODE SHOUWD GENERATE A .txt FILE AND BE ABLE TO READ IT TO PERFORM THE CALCULATION IF THE STUDENT 
//PASSED OR NOT

/*
 * 1-Create method capable to generate random grades for each course for each students
 * 2-Course should not be repeated for the same student.
 * 3-Create a constructor class for students. It should save the student grades and courses
 * 4-All this information should be also written in a txt file
 * 4- 
 */
public class ClassGrading {

	public static void main(String[] args) {
		
		char[] gradeArray = {'A','B','C','D','E','F'};
		String[] courseArray = {"Math","English","Biology","History","Geography","Arts"};
		
		for (int i = 0; i < gradeArray.length; i++) {
		    System.out.println(gradeArray[i]);
		}
	}
}
