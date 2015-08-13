

/**
 * 
 */

/**
 * @author Jasmeet Kaur
 *
 */
public class SimulationDriver{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Question quest = new Question();
		Student stu = new Student();
//    	IVote ivote = new IVote();
		
		quest.questionType();
		System.out.println("Correct answer is: " + quest.getCorrectAnswer());
		stu.setNumStudents();
		System.out.println("\nTotal number of students = " + stu.getNumStudents() + ".\n\n");
	    System.out.printf("%-20s%s","Student ID", "Answer\n");
	    
	    stu.studentAnswer();	    
	    stu.printHashtable();
//	    ivote.calculateStats();
//	    ivote.printStats();
	}

}
