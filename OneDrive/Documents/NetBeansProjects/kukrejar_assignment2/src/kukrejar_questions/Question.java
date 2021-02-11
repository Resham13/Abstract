/*
 *Professor Sasipriya Arun
 *Resham Kukreja
 *991628882
 * Assignment2
 */
package kukrejar_questions;

/**
 * This is an abstract Question Class.
 * It contains both abstract and concrete methods. 
 * 
 * This class is sub-classed by TFQuestion and SAQuestion classes.
 * 
 * @author Resham Kukreja
 */
public abstract class Question {
    
    private int questionId; // stores the questionId
    private String questionText; // stores the questionText

/**
 * Default Constructor sets the default values as mentioned in assignment
 * specifications. 
 */
    protected Question(){
        this.questionId = 1;
        this.questionText = "TBD";
    }
 
/**
 * Parameterized Constructor sets the given questionID and questionText
 
 * @param questionId
 * @param questionText 
 */
    protected Question(int questionId, String questionText){
        setQuestionId(questionId);
        setQuestionText(questionText);
    }

/**
 * sets the questionID
 * 
 * @param questionId 
 * @throws IllegaLArgumentException if id is less than or equal to 0.
 */
    public void setQuestionId(int questionId){
        if(questionId<=0){
            throw new IllegalArgumentException("Question id must be greater than 0.");
        } else{
            this.questionId = questionId;
        }
    }

/**
 * sets the questionText
 * 
 * @param questionText 
 * @throws IllegalArguementException if null string is entered.
 */
    public void setQuestionText(String questionText){
        if(questionText == null || questionText.trim().isEmpty()){
            throw new IllegalArgumentException("No question text entered");
        } else{
           this.questionText = questionText;
        }
    }
    
/**
 * Retrieves the questionId
 * 
 * @return questionId
 */
    public int getQuestionId(){
        return questionId;
    }
    
/**
 * Retrieves the questionText
 * 
 * @return questionText
 */
    public String getQuestionText(){
        return questionText;
    }

/**
 * abstract isCorrect Method as specified.
 * 
 * @param guess
 * @return 
 */
    public abstract boolean isCorrect(Object guess);

/**
 * 
 * @return String representation of the Question instance created.
 */
    @Override
    public String toString(){
        if(this.questionText.equals("TBD")){
         return "#" + getQuestionId() +": " + "No question text entered.";
        } else{
            return "#" + getQuestionId() +": " + getQuestionText() + "?";
        }
      }
    
}
     

