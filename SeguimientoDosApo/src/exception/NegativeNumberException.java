package exception;

public class NegativeNumberException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public NegativeNumberException(double weight) {
		super("You cannot enter negative values: " + weight);
	}

}
