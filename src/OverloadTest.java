public class OverloadTest {
	
	public void print(String s) {
		System.out.println("Object " + s);
	}
	
	public void print(Object s) {
		System.out.println("Object " + s);
	}
	
	public static void main(String[] args) {
		OverloadTest o = new OverloadTest();
		o.print("s");
		o.print(new Object());
		o.print(null);
	}
}
