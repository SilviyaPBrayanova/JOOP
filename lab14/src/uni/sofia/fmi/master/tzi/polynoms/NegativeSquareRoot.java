package uni.sofia.fmi.master.tzi;

public class NegativeSquareRoot extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NegativeSquareRoot(){
		super("Trying to find square root of a negative number.");
	}
}
