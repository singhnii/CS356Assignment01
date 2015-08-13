import java.util.Random;

/**
 * @author Jasmeet Kaur
 * Class questions will configure the question types
 */

public class Question implements RandomTypeGenerator{

    private String correctAnswer;
    private String questionType;
    Random rand = new Random();
    
	public int randomNum(){ //Method that randomly generates a question type
	    int value = rand.nextInt(2);
	    return value;
	    //If value = 0 then the question is MCQ.
	    //If value = 1 then the question is T/F.
    }
	
	public void questionType()
	{
		if (randomNum() == 0){
			System.out.println("Question type is: Multiple Choice.");
			questionType = "mcq";
			mcqAnswer();
		}
		else{
			System.out.println("Question type is: T/F.");
			questionType = "bool";
			booleanAnswer();
		}	
	}
	
	public String getQuestionType(){
		return questionType;
	}
	
	public void mcqAnswer(){
		
			String[] mcqChoices = {"A","B","C","D"};
			correctAnswer = mcqChoices[rand.nextInt(mcqChoices.length)];
		}
	
	public void booleanAnswer(){
		
			String[] boolChoices = {"True","False"};
			correctAnswer = boolChoices[rand.nextInt(boolChoices.length)];	
			
		}
	
	public String getCorrectAnswer(){
		
		return correctAnswer;
		
	}
	
}
