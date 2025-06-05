package Course2;

public class NegativeInputException extends Exception {
    public NegativeInputException(){
        this("Input must be nonnegative.");
    }
    public NegativeInputException(String message){
        super(message);
    }
}
