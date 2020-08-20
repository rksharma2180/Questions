public class ThrowError {
	public static void main(String[] args) {
		
		//Valid cases
		//throw new Error();
		
		try {
			throw new CustomError();
		} catch (Exception e) {
			System.out.println("Caught Error");
			e.printStackTrace();
		}
	}
}

class CustomError extends Error {

	private static final long serialVersionUID = 1L;
	
	public CustomError() {
		super();
	}
	
	public CustomError(String message) {
		super(message);
	}
	
}