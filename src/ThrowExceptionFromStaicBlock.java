public class ThrowExceptionFromStaicBlock {
	
	static {
		try {
			System.out.println("test");	
			
		} catch(Exception e) {
			throw new RuntimeException();
		}		
	}
	
	public static void main(String[] args) {
		System.out.print("tre");
	}
	

}
