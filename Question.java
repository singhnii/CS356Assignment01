import java.util.Random;

/**
 * @author Jasmeet Kaur
 * Class questions will randomly configure the question type 
 * and correct answer
 */

public class Question implements RandomTypeGenerator{

    private String correctAnswer;
    private String questionType;
    Random rand = new Random();
    
    //Randomly generates a question type
    public int randomNum(){ 
	    int value = rand.nextInt(2);
	    return value;
	    //If value = 0 then the question is MCQ.
	    //If value = 1 then the question is T/F.
    }
	
	//Set question type to MCQ or Boolean
    public String getQuestionType()
	{
		if (randomNum() == 0){
			return questionType = "mcq";
		}
		else{
			return questionType = "bool";
		}	
	}
	
	//this method call the method to generate the correct answer
    public void setCorrectAnswer(){
		if(questionType.equals("mcq")){
			mcqAnswer();
		}
		else{
			booleanAnswer();
		}
	}
	
	//Generate a correct answer
	public void mcqAnswer(){
		
			String[] mcqChoices = {"A","B","C","D"};
			correctAnswer = mcqChoices[rand.nextInt(mcqChoices.length)];
		}
	
	//Generate a correct answer
	public void booleanAnswer(){
		
			String[] boolChoices = {"True","False"};
			correctAnswer = boolChoices[rand.nextInt(boolChoices.length)];	
			
		}
	
	//getter method
	public String getCorrectAnswer(){
		return correctAnswer;		
	}	
}
