package UserDefinedException;

public class UserDefinedException extends Exception{

	@Override
	public String toString() {
		return "No user Found";
	}
}
