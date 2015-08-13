import java.util.Random;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
import java.util.Hashtable;
/**
 * @author Jasmeet Kaur
 * 
 */
public class Student extends Question {
	
	private int numStudents;
	private String studentID;
	private String studentAns;
	private String mult = "mcq";
	private String bool = "boolean";
	private String questionType;
	Random rand = new Random();
	IVote iVote = new IVote();
	Question que = new Question();
	Hashtable<String, String> table = new Hashtable<String, String>();

	//method that randomly generates # of students
	 public void setNumStudents(){
		numStudents = rand.nextInt(20) + 10; //Generates a random size of 10 to 30 students.
	}
	 
	public int getNumStudents(){
		return numStudents;
	}
	
	HashSet<String> hash = new HashSet<>(getNumStudents());
	
	//Method that generates random alpha-numeric student IDs of 6 characters.
	public String generateRandomID(){
		char[] characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++){
		   char c = characters[rand.nextInt(characters.length)];
		   sb.append(c);
		}
		
		studentID = sb.toString();
		return studentID;
	}
	
	public String getStudentID(){
		return studentID;
	}
	
	//Method that stores the student Ids in a hashset so that there are no duplicates
//	void storeIDs(){
//		for (int i = 0; i < getNumStudents(); i++){
//			hash.add(getRandomID());
//		}//End for loop
//	}//End method storeIDs.

 	public void answerType(){
		questionType = super.getQuestionType();
 		if(questionType == (mult))
 			booleanAnswer();
 		else 
 			mcqAnswer();
 	}
	
	public void mcqAnswer(){
 		String[] mcqChoices = {"A", "B", "C", "D"};
 		studentAns = mcqChoices[rand.nextInt(mcqChoices.length)];
 	}
 	
 	public void booleanAnswer(){
 		String[] boolChoices = {"T", "F"};
 		studentAns = boolChoices[rand.nextInt(boolChoices.length)];
 	}
	
 	public String getStudentAnswer(){
 		return studentAns;
 	}
 	 	
 	public void studentAnswer(){	
 		for(int i = 0; i< numStudents; i++){
 			hash.add(generateRandomID()); 
 			answerType();	
 			table.put(studentID, studentAns);
 	    }
 	}
 	
 	public void printHashtable(){
 		Set<Entry<String, String>> set = table.entrySet();
 		Iterator<Entry<String, String>> it = set.iterator();
 		while(it.hasNext()){
 			Map.Entry entry = (Map.Entry) it.next();
 			System.out.printf("\n%-20s%s",entry.getKey() , entry.getValue());
 		}
 		
 	}	
}






