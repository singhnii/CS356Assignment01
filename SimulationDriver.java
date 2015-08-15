

/**CS356 Assignment1
 * iVote simulator
 * @author Jasmeet Kaur
 *This is the driver class
 */
public class SimulationDriver{

	//main method
	public static void main(String[] args) {
		
		//Class Instances
		Question quest = new Question();
		Student stu = new Student();
    	IVote ivote = new IVote();
		String qType;
		qType = quest.getQuestionType();
		
		//Produce the question type
		if(qType.equals("mcq")){
			System.out.println("Question type is: Multiple Choice.");
		}
		else{
			System.out.println("Question type is: T/F.");
		}
		
		//Generate a correct answer
		quest.setCorrectAnswer();
		
		//Print out result
		System.out.println("Correct answer is: " + quest.getCorrectAnswer());
		
		//Generate a random number of students
		stu.setNumStudents();
			
		System.out.println("\nTotal number of students = " + stu.getNumStudents() + ".\n\n");
	    System.out.printf("%-20s%s","Student ID", "Answer\n");
	    
	    for(int i = 0; i < stu.getNumStudents(); i++){
	    	stu.setStudentID();
	    	stu.setStudentAnswer(qType);
	    	ivote.setTable(stu.getStudentID(), stu.getStudentAnswer());
	    }
	    
	    ivote.printHashtable();
	    
	    ivote.calculateStats();
	    
	    System.out.println("\n\n\niVote Statistics:");
	    
	    ivote.printStats();
	    
//	    stu.studentAnswer();	    
//	    stu.printHashtable();
//	    ivote.calculateStats();
//	    ivote.printStats();
	}

}
