import java.util.HashSet;
import java.util.Random; 
/**
 * @author Jasmeet Kaur
 * Student class will generate class size, student IDs, 
 * and student answers.
 */

public class Student extends Question {
	
	private int numStudents;
	private String studentID;
	private String studentAns;
	
	Random rand = new Random(); //create Random instance	
	
	//Generates a class size between 10 and 30 students
	 public void setNumStudents(){
		numStudents = rand.nextInt(20) + 10; 
	}
	 
	//getter method
	 public int getNumStudents(){
		return numStudents;
	}
	
	//Create a HashSet to store unique student IDs
	 HashSet<String> hash = new HashSet<>(getNumStudents());
	
	//Generate random alpha-numeric student IDs of 6 characters.
	public void setStudentID(){
		char[] characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++){
		   char c = characters[rand.nextInt(characters.length)];
		   sb.append(c);
		}
		
		studentID = sb.toString();
	}
	
	public String getStudentID(){
		return studentID;
	}
	
	//Generate student answer
 	public void setStudentAnswer(String s){
 		if(s.equals("mcq")){
 			mcqAnswer();
 		} 			
 		else{
 			booleanAnswer();
 		}
 	}
	
	public void mcqAnswer(){
 		String[] mcqChoices = {"A", "B", "C", "D"};
 		studentAns = mcqChoices[rand.nextInt(mcqChoices.length)];
 	}
 	
 	public void booleanAnswer(){
 		String[] boolChoices = {"T", "F"};
 		studentAns = boolChoices[rand.nextInt(boolChoices.length)];
 	}
	
 	//getter method
 	public String getStudentAnswer(){
 		return studentAns;
 	}	
}






